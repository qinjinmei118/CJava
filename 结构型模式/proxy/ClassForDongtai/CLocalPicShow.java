package com.qjm.proxy.ClassForDongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLocalPicShow {
	private Object target;
	public CLocalPicShow( Object target) {
		this.target=target;
	}
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO �Զ����ɵķ������
				System.out.println("׼������ͼƬ"+args[0].toString());
				Thread thread=new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO �Զ����ɵķ������
						try {
							method.invoke(target, args);
						}catch(Exception e) {
							e.printStackTrace();
						}

					}
				});
				thread.start();
				return null;
			}
		});
	}
}
