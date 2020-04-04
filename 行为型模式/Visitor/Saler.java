package com.qjm.Visitor;

public class Saler extends AVisitor{

	@Override
	public void visit(Apple apple) {
		// TODO 自动生成的方法存根
		System.out.println("收银员："+name+"买苹果结账");
	}

	@Override
	public void visit(Book book) {
		// TODO 自动生成的方法存根
		System.out.println("收银员："+name+"给买书结账");
	}

}
