package com.qjm.proxy.ClassForStaticProxy;

public class Client {
	public static void main(String args[]) {
		//ILocalPicShow ls=new ILocalPicShow();
		//ls.ShowPic("�ҵ�ͼƬ");
		IShowPic proxy=new ILocalPicShow();
		//IShowPic ipc=new CRemoPic();
		proxy.ShowPic("AAA");
	}
}
