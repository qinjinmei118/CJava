package com.qjm.Visitor;

public class Saler extends AVisitor{

	@Override
	public void visit(Apple apple) {
		// TODO �Զ����ɵķ������
		System.out.println("����Ա��"+name+"��ƻ������");
	}

	@Override
	public void visit(Book book) {
		// TODO �Զ����ɵķ������
		System.out.println("����Ա��"+name+"���������");
	}

}
