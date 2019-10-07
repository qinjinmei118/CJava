package org.ddd.annotation.example;


public @interface Column {
	public String value() default "";
	public boolean nullable() default true;
	public int length() default -1;
}