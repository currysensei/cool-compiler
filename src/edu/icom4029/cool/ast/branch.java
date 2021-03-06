package edu.icom4029.cool.ast;

import java.io.PrintStream;
import java.util.Collections;
import java.util.List;

import edu.icom4029.cool.ast.base.TreeNode;
import edu.icom4029.cool.cgen.BranchVariable;
import edu.icom4029.cool.cgen.CgenSupport;
import edu.icom4029.cool.core.Utilities;
import edu.icom4029.cool.lexer.AbstractSymbol;
import edu.icom4029.cool.lexer.AbstractTable;
import edu.icom4029.cool.semant.ClassTable;
import edu.icom4029.cool.semant.SymbolTable;

/** Defines AST constructor 'branch'.
<p>
See <a href="TreeNode.html">TreeNode</a> for full documentation. */
public class branch extends Case {
	protected AbstractSymbol name;
	protected AbstractSymbol type_decl;
	protected Expression expr;
	/** Creates "branch" AST node. 
	 *
	 * @param lineNumber the line in the source file from which this node came.
	 * @param a0 initial value for name
	 * @param a1 initial value for type_decl
	 * @param a2 initial value for expr
	 */
	public branch(int lineNumber, AbstractSymbol a1, AbstractSymbol a2, Expression a3) {
		super(lineNumber);
		name = a1;
		type_decl = a2;
		expr = a3;
	}

	public AbstractSymbol getTypeDecl() {
		return type_decl;
	}

	public void semant(ClassTable classTable, class_ c, SymbolTable symbolTable) {
		symbolTable.enterScope();
		symbolTable.addId(name, type_decl);
		expr.semant(classTable, c, symbolTable);
		set_type(expr.get_type());	// Type is the type of the expression in the branch.
		symbolTable.exitScope();
	}

	public TreeNode copy() {
		return new branch(lineNumber, copy_AbstractSymbol(name), copy_AbstractSymbol(type_decl), (Expression)expr.copy());
	}

	public void dump(PrintStream out, int n) {
		out.print(Utilities.pad(n) + "branch\n");
		dump_AbstractSymbol(out, n+2, name);
		dump_AbstractSymbol(out, n+2, type_decl);
		expr.dump(out, n+2);
	}


	public void dump_with_types(PrintStream out, int n) {
		dump_line(out, n);
		out.println(Utilities.pad(n) + "_branch");
		dump_AbstractSymbol(out, n + 2, name);
		dump_AbstractSymbol(out, n + 2, type_decl);
		expr.dump_with_types(out, n + 2);
	}

	public void code(int labelEnd, PrintStream str) {
		CgenSupport.emitLoad(CgenSupport.T1, 0, CgenSupport.ACC, str);
		List<Integer> childrenTags = AbstractTable.classTable.getChildrenTags(type_decl);
		
		int minTag = Collections.min(childrenTags);
		int maxTag = Collections.max(childrenTags);
		
		int labelNext = CgenSupport.genLabelNum();
		CgenSupport.emitBlti(CgenSupport.T1, minTag, labelNext, str);
		CgenSupport.emitBgti(CgenSupport.T1, maxTag, labelNext, str);
		
		int offset = AbstractTable.offset++;
		CgenSupport.emitPush(CgenSupport.ACC, str);
		AbstractTable.varTable.enterScope();
		AbstractTable.varTable.addId(name, new BranchVariable(offset));
		
		expr.code(str);
		
		AbstractTable.varTable.exitScope();
		
		CgenSupport.emitPop(str);
		AbstractTable.offset--;
		CgenSupport.emitBranch(labelEnd, str);
		CgenSupport.emitLabelDef(labelNext, str);
	}
}
