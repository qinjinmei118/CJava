package com.qjm.zeren_Chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
	private int weight;//ˮ������
	protected List<String> fruitBox;//װˮ��������
	private AbstractFruitSort nextFruitSort;//��һ���ּ���
	public void getFruitBox() {
		System.out.print("weight:"+weight);
		System.out.println("����:"+fruitBox.size());
		for(String i:fruitBox) {
			System.out.print(i+",");
		}
		System.out.println("   ");
	}
	public AbstractFruitSort(int weight) {
		this.weight=weight;
		fruitBox=new ArrayList<String>();
	}
	//�����һ�����ʺϾ�ת����һ���ּ���
	public void setNextSort(AbstractFruitSort nextFruitSort ) {
		this.nextFruitSort=nextFruitSort;
	}
	//��ˮ���ź�������
	public void sendFruit(int weight,String fruit) {
		if(this.weight==weight) {
			pushBox(fruit);
		}else {
			if(nextFruitSort!=null) {
				//������һ���ּ���
				nextFruitSort.sendFruit(weight, fruit);
			}
		}
	}
	abstract protected void pushBox(String fruit);
}
