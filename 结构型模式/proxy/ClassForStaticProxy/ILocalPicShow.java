package com.qjm.proxy.ClassForStaticProxy;

public class ILocalPicShow implements IShowPic,Runnable{
	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		// TODO 自动生成的方法存根
		this.picname=picname;
		pic=new CRemoPic();
		System.out.println("准备载入图片"+picname);
		Thread th=new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		pic.ShowPic(picname);
		System.out.println("图片调用完成");
		
	}

}
