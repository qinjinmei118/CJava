package com.qjm.proxy.ClassForStaticProxy;

public class CRemoPic implements IShowPic {

	@Override
	public void ShowPic(String picname) {
		// TODO �Զ����ɵķ������
		for(int i=0;i<3;i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
