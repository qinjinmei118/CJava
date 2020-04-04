package com.qjm.proxy.ClassForDongtai;

public class CTest implements ITestInterface{

	@Override
	public void sendMessage(String mes) {
		// TODO 自动生成的方法存根
		for(int i=5;i>=0;i--) {
			System.out.println("怪物出现还有"+i+"秒");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		System.out.println(mes+"怪物出来");
	}

}
