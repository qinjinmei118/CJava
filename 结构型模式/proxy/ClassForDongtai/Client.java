package com.qjm.proxy.ClassForDongtai;

public class Client {
	public static void main(String args[]) {
		/*IShowPic isp=new CRemoPic();
		CLocalPicShow pic=new CLocalPicShow(isp);
		IShowPic localpic=(IShowPic) pic.getProxyInstance();
		localpic.ShowPic("AAa");*/
		ITestInterface ipic=new CTest();
		ITestInterface proxy=(ITestInterface) new CLocalPicShow(ipic).getProxyInstance();
		proxy.sendMessage("BBB");
	}
}
