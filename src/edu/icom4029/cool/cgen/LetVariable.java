package edu.icom4029.cool.cgen;

import java.io.PrintStream;

public class LetVariable extends Variable {

	private int offset;

	public LetVariable(int offset) {
		this.offset = offset;
	}

	@Override
	public void emitRef(PrintStream s) {
		CgenSupport.emitLoad(CgenSupport.ACC, -offset, CgenSupport.FP, s);
	}

	@Override
	public void emitAssign(PrintStream s) {
		CgenSupport.emitStore(CgenSupport.ACC, -offset, CgenSupport.FP, s);
	}
}
