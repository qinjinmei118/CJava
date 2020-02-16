package com.qjm.connection;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		LoginForm demo=new LoginForm();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = input.next();
		System.out.println("请输入密码：)");
		String userPassword = input.next();
		demo.display(userName,userPassword);
	}
}
