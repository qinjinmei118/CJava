package com.qjm.connection;

public class LoginForm {
	private UserDao dao;
	public void init() {
		System.out.println("��ʼ��............");
	}
	public void display(String userName,String userPassword) {
		boolean flag=dao.findUser(userName, userPassword);
		if(flag==true) {
		System.out.println("�ҵ���ʾ����.............");
		}
		else {
			System.out.println("δ�ҵ�.............");
		}
	}
	public void validate() {
		System.out.println("��Ч............");
	}
}
