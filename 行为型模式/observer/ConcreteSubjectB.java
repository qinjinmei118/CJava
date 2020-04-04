package com.qjm.observer;

public class ConcreteSubjectB extends Subjects{

	
	public ConcreteSubjectB() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("A目标发生变化");
		for(ObserverO obs:observers) {
			obs.response();
		}
	}
}
