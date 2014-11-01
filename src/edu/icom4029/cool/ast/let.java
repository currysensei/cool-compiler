package edu.icom4029.cool.ast;

import java.io.PrintStream;

import edu.icom4029.cool.ast.base.TreeNode;
import edu.icom4029.cool.core.Utilities;
import edu.icom4029.cool.lexer.AbstractSymbol;

/** Defines AST constructor 'let'.
<p>
See <a href="TreeNode.html">TreeNode</a> for full documentation. */
public class let extends Expression {
	protected AbstractSymbol identifier;
	protected AbstractSymbol type_decl;
	protected Expression init;
	protected Expression body;
	/** Creates "let" AST node. 
	 *
	 * @param lineNumber the line in the source file from which this node came.
	 * @param a0 initial value for identifier
	 * @param a1 initial value for type_decl
	 * @param a2 initial value for init
	 * @param a3 initial value for body
	 */
	public let(int lineNumber, AbstractSymbol a1, AbstractSymbol a2, Expression a3, Expression a4) {
		super(lineNumber);
		identifier = a1;
		type_decl = a2;
		init = a3;
		body = a4;
	}
	public TreeNode copy() {
		return new let(lineNumber, copy_AbstractSymbol(identifier), copy_AbstractSymbol(type_decl), (Expression)init.copy(), (Expression)body.copy());
	}
	public void dump(PrintStream out, int n) {
		out.print(Utilities.pad(n) + "let\n");
		dump_AbstractSymbol(out, n+2, identifier);
		dump_AbstractSymbol(out, n+2, type_decl);
		init.dump(out, n+2);
		body.dump(out, n+2);
	}


	public void dump_with_types(PrintStream out, int n) {
		dump_line(out, n);
		out.println(Utilities.pad(n) + "_let");
		dump_AbstractSymbol(out, n + 2, identifier);
		dump_AbstractSymbol(out, n + 2, type_decl);
		init.dump_with_types(out, n + 2);
		body.dump_with_types(out, n + 2);
		dump_type(out, n);
	}
	/** Generates code for this expression.  This method is to be completed 
	 * in programming assignment 5.  (You may or add remove parameters as
	 * you wish.)
	 * @param s the output stream 
	 * */
	public void code(PrintStream s) {
	}
}