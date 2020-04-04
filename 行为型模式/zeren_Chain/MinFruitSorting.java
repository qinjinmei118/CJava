package com.qjm.zeren_Chain;

public class MinFruitSorting extends AbstractFruitSort{

	public MinFruitSorting(int weight) {
		super(weight);
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO 自动生成的方法存根
		fruitBox.add("打水果汁："+fruit);
	}

}
