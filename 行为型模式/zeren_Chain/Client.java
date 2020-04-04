package com.qjm.zeren_Chain;

import java.util.Random;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class Client {
	public static void main(String args[]) {
		AbstractFruitSort bfs,mfs,sfs;
		bfs=new BigFruitSorting(9);
		mfs=new MidFruitSorting(5);
		sfs=new MinFruitSorting(2);
		
		//������������
		bfs.setNextSort(mfs);//����
		mfs.setNextSort(sfs);//�д�С
		
		Random rm=new Random();
		for(int i=0;i<1000;i++) {
			int weight=rm.nextInt(10);
			bfs.sendFruit(weight, "����");
		}
		bfs.getFruitBox();
		mfs.getFruitBox();
		sfs.getFruitBox();
	}
}
