package com.qjm.proxy.ClassForDongtai;

public class CTest implements ITestInterface{

	@Override
	public void sendMessage(String mes) {
		// TODO �Զ����ɵķ������
		for(int i=5;i>=0;i--) {
			System.out.println("������ֻ���"+i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		System.out.println(mes+"�������");
	}

}
