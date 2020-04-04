package com.qjm.proxy.ClassForStaticProxy;

public class Client {
	public static void main(String args[]) {
		//ILocalPicShow ls=new ILocalPicShow();
		//ls.ShowPic("ÎÒµÄÍ¼Æ¬");
		IShowPic proxy=new ILocalPicShow();
		//IShowPic ipc=new CRemoPic();
		proxy.ShowPic("AAA");
	}
}
