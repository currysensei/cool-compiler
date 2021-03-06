package edu.icom4029.cool.ast;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import edu.icom4029.cool.ast.base.TreeNode;
import edu.icom4029.cool.core.TreeConstants;
import edu.icom4029.cool.core.Utilities;
import edu.icom4029.cool.lexer.AbstractSymbol;
import edu.icom4029.cool.semant.ClassTable;
import edu.icom4029.cool.semant.SymbolTable;

/** Defines AST constructor 'class_'.
<p>
See <a href="TreeNode.html">TreeNode</a> for full documentation. */
public class class_ extends ClassAbstract {
	protected AbstractSymbol name;
	protected AbstractSymbol parent;
	protected Features       features;
	protected AbstractSymbol filename;
	private   SymbolTable    methodTable;
	private   SymbolTable    attrTable;

	/** Creates "class_" AST node. 
	 *
	 * @param lineNumber the line in the source file from which this node came.
	 * @param a0 initial value for name
	 * @param a1 initial value for parent
	 * @param a2 initial value for features
	 * @param a3 initial value for filename
	 */
	public class_(int lineNumber, AbstractSymbol a1, AbstractSymbol a2, Features a3, AbstractSymbol a4) {
		super(lineNumber);
		name     = a1;
		parent   = a2;
		features = a3;
		filename = a4;
	}
	
	public void semant(ClassTable classTable, SymbolTable symbolTable) {
		
		// Check if this class inherits from an undefined class
		if (!classTable.hasClass(parent.getString())) {
			classTable.semantError(this).println("Class " + name.getString() + " inherits from an undefined class");
			return;
		}
		
		symbolTable.enterScope();                         // Enter the scope defined by this class
		symbolTable.addId(TreeConstants.SELF_TYPE, name); // Add SELF_TYPE to the current scope. Every class has its SELF_TYPE
		symbolTable.addTable(attrTable);
		
		// Type check each of the features that compose the class
		for (Enumeration e = features.getElements(); e.hasMoreElements();) {
			((Feature) e.nextElement()).semant(classTable, this, symbolTable);			
		}
		
		symbolTable.exitScope(); // Leave the scope defined by this class
	}
	
	public void fillMethodAttrTable(ClassTable classTable) {
		
		if (parent != TreeConstants.No_class) {
			class_ parentClass = classTable.getClass(parent.getString());
			if (parentClass == null) {
				return;
			}			
			methodTable = parentClass.getMethodTable();
			attrTable   = parentClass.getAttrTable();
			if (methodTable == null) {
				parentClass.fillMethodAttrTable(classTable);
			}
			methodTable = new SymbolTable(parentClass.getMethodTable());
			attrTable   = new SymbolTable(parentClass.getAttrTable());
		}
		else {
			methodTable = new SymbolTable();
			attrTable   = new SymbolTable();
		}
		
		methodTable.enterScope();
		attrTable.enterScope();
		
		for (Enumeration e = features.getElements(); e.hasMoreElements();) {
			Feature feature = (Feature) e.nextElement();
			String err      = feature.fillMethodTable(methodTable);
			
			if (!err.isEmpty()) {
				classTable.semantError(this).println(err);
			}
			
			err = feature.fillAttrTable(attrTable);
			if (!err.isEmpty()) {
				classTable.semantError(this).println(err);
			}
		}
	}

	public TreeNode copy() {
		return new class_(lineNumber, copy_AbstractSymbol(name), copy_AbstractSymbol(parent), (Features)features.copy(), copy_AbstractSymbol(filename));
	}

	public void dump(PrintStream out, int n) {
		out.print(Utilities.pad(n) + "class_\n");
		dump_AbstractSymbol(out, n+2, name);
		dump_AbstractSymbol(out, n+2, parent);
		features.dump(out, n+2);
		dump_AbstractSymbol(out, n+2, filename);
	}

	public void dump_with_types(PrintStream out, int n) {
		dump_line(out, n);
		out.println(Utilities.pad(n) + "_class");
		dump_AbstractSymbol(out, n + 2, name);
		dump_AbstractSymbol(out, n + 2, parent);
		out.print(Utilities.pad(n + 2) + "\"");
		Utilities.printEscapedString(out, filename.getString());
		out.println("\"\n" + Utilities.pad(n + 2) + "(");
		for (Enumeration e = features.getElements(); e.hasMoreElements();) {
			((Feature)e.nextElement()).dump_with_types(out, n + 2);
		}
		out.println(Utilities.pad(n + 2) + ")");
	}
	
	public AbstractSymbol getName()        { return name;        }
	public AbstractSymbol getParent()      { return parent;      }
	public AbstractSymbol getFilename()    { return filename;    }
	public Features       getFeatures()    { return features;    }
	public SymbolTable    getMethodTable() { return methodTable; }
	public SymbolTable    getAttrTable()   { return attrTable;   }
	
	public List<method> getMethods() {
		List<method> methods = new ArrayList<method>();
		for (Enumeration e = features.getElements(); e.hasMoreElements();) {
			Feature feature = (Feature) e.nextElement();
			if (feature instanceof method) {
				methods.add((method) feature);
			}
		}
		return methods;
	}
}
