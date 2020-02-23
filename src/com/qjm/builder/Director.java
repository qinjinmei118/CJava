package com.qjm.builder;

public class Director {
	protected AbBuilder builder;
	public Director(AbBuilder builder)
    {
        this.builder=builder;
    }
	public CarDetail construct()
    {
        builder.buildPart1();
     
        return builder.getResult();
    }
}
