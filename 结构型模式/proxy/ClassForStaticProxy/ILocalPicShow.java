package com.qjm.proxy.ClassForStaticProxy;

public class ILocalPicShow implements IShowPic,Runnable{
	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		// TODO �Զ����ɵķ������
		this.picname=picname;
		pic=new CRemoPic();
		System.out.println("׼������ͼƬ"+picname);
		Thread th=new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		pic.ShowPic(picname);
		System.out.println("ͼƬ�������");
		
	}

}
