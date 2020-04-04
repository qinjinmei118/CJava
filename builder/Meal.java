package com.qjm.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items=new ArrayList<Item>();
	public void addItem(Item item) {
		items.add(item);
	}
	public int getTotal() {
		int sum=0;
		for(Item item:items) {
			//System.out.println("Item:"+item);
			sum+=item.price();
		}
		return sum;
	}
	public void showItem() {
		for(Item item:items) {
			System.out.println("Item:"+item.name());
			System.out.println(",packing:"+item.packing());
			System.out.println(",price:"+item.price());
		}
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
}
