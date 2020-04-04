package com.qjm.Visitor;
//每种产品可能面临接受的访问者
public interface IProduct {
	void accept(AVisitor visitor);
}
