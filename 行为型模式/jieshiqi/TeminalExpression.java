package com.qjm.jieshiqi;

public class TeminalExpression implements Expression{
	private String data;
	public TeminalExpression(String data) {
		this.data=data;
	}
	@Override
	public boolean interpret(String context) {
		if(context.contains(data)) 
			return true;
		return false;
	}
	
}
