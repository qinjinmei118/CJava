package com.qjm.observer;

public class ConcreteSubjectA extends Subjects{

	
	public ConcreteSubjectA() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public void notifyObserver() {
		// TODO �Զ����ɵķ������
		System.out.println("AĿ�귢���仯");
		for(ObserverO obs:observers) {
			obs.response();
		}
	}
}
