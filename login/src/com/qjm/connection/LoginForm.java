package com.qjm.connection;

public class LoginForm {
	private UserDao dao;
	public void init() {
		System.out.println("初始化............");
	}
	public void display(String userName,String userPassword) {
		boolean flag=dao.findUser(userName, userPassword);
		if(flag==true) {
		System.out.println("找到显示数据.............");
		}
		else {
			System.out.println("未找到.............");
		}
	}
	public void validate() {
		System.out.println("有效............");
	}
}
