package com.qjm.builder;

public abstract class AbBuilder {
	protected CarDetail card=new CarDetail();
	public abstract void buildPart1(); 
	 public CarDetail getResult()
	    {
	        return card;
	    }
}
