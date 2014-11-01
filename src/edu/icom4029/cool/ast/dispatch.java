package edu.icom4029.cool.ast;

import java.io.PrintStream;
import java.util.Enumeration;

import edu.icom4029.cool.ast.base.TreeNode;
import edu.icom4029.cool.core.Utilities;
import edu.icom4029.cool.lexer.AbstractSymbol;

/** Defines AST constructor 'dispatch'.
<p>
See <a href="TreeNode.html">TreeNode</a> for full documentation. */
public class dispatch extends Expression {
	protected Expression expr;
	protected AbstractSymbol name;
	protected Expressions actual;
	/** Creates "dispatch" AST node. 
	 *
	 * @param lineNumber the line in the source file from which this node came.
	 * @param a0 initial value for expr
	 * @param a1 initial value for name
	 * @param a2 initial value for actual
	 */
	public dispatch(int lineNumber, Expression a1, AbstractSymbol a2, Expressions a3) {
		super(lineNumber);
		expr = a1;
		name = a2;
		actual = a3;
	}
	public TreeNode copy() {
		return new dispatch(lineNumber, (Expression)expr.copy(), copy_AbstractSymbol(name), (Expressions)actual.copy());
	}
	public void dump(PrintStream out, int n) {
		out.print(Utilities.pad(n) + "dispatch\n");
		expr.dump(out, n+2);
		dump_AbstractSymbol(out, n+2, name);
		actual.dump(out, n+2);
	}


	public void dump_with_types(PrintStream out, int n) {
		dump_line(out, n);
		out.println(Utilities.pad(n) + "_dispatch");
		expr.dump_with_types(out, n + 2);
		dump_AbstractSymbol(out, n + 2, name);
		out.println(Utilities.pad(n + 2) + "(");
		for (Enumeration e = actual.getElements(); e.hasMoreElements();) {
			((Expression)e.nextElement()).dump_with_types(out, n + 2);
		}
		out.println(Utilities.pad(n + 2) + ")");
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