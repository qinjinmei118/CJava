package com.qjm.Visitor;

public class Book implements IProduct{

	@Override
	public void accept(AVisitor visitor) {
		visitor.visit(this);
	}

}
