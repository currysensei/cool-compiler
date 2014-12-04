package edu.icom4029.cool.cgen;

import java.io.PrintStream;

public class BranchVariable extends Variable {

	private int offset;

	public BranchVariable(int offset) {
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
