package com.qjm.jieshiqi;

public class Client {
	public static void main(String args[]) {
		 Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedFemaleExpression();
	 
	      System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("July is a married women? " 
	      + isMarriedWoman.interpret("Married July"));
	}
	public static Expression getMaleExpression() {
		Expression Robert=new TeminalExpression("Robert");
		Expression John=new TeminalExpression("John");
		return new OrExpression(Robert, John);
	}
	public static Expression getMarriedFemaleExpression() {
		Expression July=new TeminalExpression("July");
		Expression Married=new TeminalExpression("Married");
		return new AndExpression(July, Married);
	}
}
