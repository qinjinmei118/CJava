package com.qjm.observer;

public class Client {
	public static void main(String args[]) {
		Subjects su=new ConcreteSubjectA();
		ObserverO ob1=new ConcreteObserverA();
		ObserverO ob2=new ConcreteObserverB();
		su.add(ob1);
		su.add(ob2);
		su.notifyObserver();
	}
}
