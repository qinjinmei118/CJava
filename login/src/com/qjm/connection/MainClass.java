package com.qjm.connection;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		LoginForm demo=new LoginForm();
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String userName = input.next();
		System.out.println("���������룺)");
		String userPassword = input.next();
		demo.display(userName,userPassword);
	}
}
