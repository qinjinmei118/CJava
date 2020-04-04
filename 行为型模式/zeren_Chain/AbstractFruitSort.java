package com.qjm.zeren_Chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
	private int weight;//水果重量
	protected List<String> fruitBox;//装水果的盘子
	private AbstractFruitSort nextFruitSort;//下一个分捡器
	public void getFruitBox() {
		System.out.print("weight:"+weight);
		System.out.println("个数:"+fruitBox.size());
		for(String i:fruitBox) {
			System.out.print(i+",");
		}
		System.out.println("   ");
	}
	public AbstractFruitSort(int weight) {
		this.weight=weight;
		fruitBox=new ArrayList<String>();
	}
	//如果上一个不适合就转向下一个分拣器
	public void setNextSort(AbstractFruitSort nextFruitSort ) {
		this.nextFruitSort=nextFruitSort;
	}
	//把水果放盒子里面
	public void sendFruit(int weight,String fruit) {
		if(this.weight==weight) {
			pushBox(fruit);
		}else {
			if(nextFruitSort!=null) {
				//调用下一个分拣器
				nextFruitSort.sendFruit(weight, fruit);
			}
		}
	}
	abstract protected void pushBox(String fruit);
}
