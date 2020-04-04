package com.qjm.observer;

import java.util.ArrayList;
import java.util.List;
//目标集合，抽象目标
public abstract class Subjects {
	protected List<ObserverO> observers;
	public Subjects() {
		observers=new ArrayList<ObserverO>();
	}
	public void add(ObserverO observer) {
		observers.add(observer);
	}
	public void remove(ObserverO observer) {
		observers.remove(observer);
	}
	public abstract void notifyObserver();
}
