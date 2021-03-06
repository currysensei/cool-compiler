package edu.icom4029.cool.ast;

import java.io.PrintStream;

import edu.icom4029.cool.ast.base.TreeNode;
import edu.icom4029.cool.cgen.CgenSupport;
import edu.icom4029.cool.core.TreeConstants;
import edu.icom4029.cool.core.Utilities;
import edu.icom4029.cool.semant.ClassTable;
import edu.icom4029.cool.semant.SymbolTable;

/** Defines AST constructor 'loop'.
<p>
See <a href="TreeNode.html">TreeNode</a> for full documentation. */
public class loop extends Expression {
	protected Expression pred;
	protected Expression body;
	/** Creates "loop" AST node. 
	 *
	 * @param lineNumber the line in the source file from which this node came.
	 * @param a0 initial value for pred
	 * @param a1 initial value for body
	 */
	public loop(int lineNumber, Expression a1, Expression a2) {
		super(lineNumber);
		pred = a1;
		body = a2;
	}

	public TreeNode copy() {
		return new loop(lineNumber, (Expression)pred.copy(), (Expression)body.copy());
	}

	public void dump(PrintStream out, int n) {
		out.print(Utilities.pad(n) + "loop\n");
		pred.dump(out, n+2);
		body.dump(out, n+2);
	}


	public void dump_with_types(PrintStream out, int n) {
		dump_line(out, n);
		out.println(Utilities.pad(n) + "_loop");
		pred.dump_with_types(out, n + 2);
		body.dump_with_types(out, n + 2);
		dump_type(out, n);
	}

	/** Generates code for this expression.  This method is to be completed 
	 * in programming assignment 5.  (You may or add remove parameters as
	 * you wish.)
	 * @param s the output stream 
	 * */
	public void code(PrintStream s) {
		int labelLoop = CgenSupport.genLabelNum();
		int labelEnd = CgenSupport.genLabelNum();
		
		CgenSupport.emitLabelDef(labelLoop, s);
		pred.code(s);
		CgenSupport.emitFetchInt(CgenSupport.T1, CgenSupport.ACC, s);
		CgenSupport.emitBeqz(CgenSupport.T1, labelEnd, s);
		body.code(s);
		CgenSupport.emitBranch(labelLoop, s);
		CgenSupport.emitLabelDef(labelEnd, s);
		CgenSupport.emitMove(CgenSupport.ACC, CgenSupport.ZERO, s);
	}

	@Override
	public void semant(ClassTable classTable, class_ cl, SymbolTable symbolTable) {
		pred.semant(classTable, cl, symbolTable);
		if (pred.get_type() != TreeConstants.Bool) {
			classTable.semantError(cl).println("Loop condition does not have type Bool.");
		}
		body.semant(classTable, cl, symbolTable);
		set_type(TreeConstants.Object_);	// Type is always Object.
	}
}
