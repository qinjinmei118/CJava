package com.qjm.zeren_Chain;

import java.util.Random;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class Client {
	public static void main(String args[]) {
		AbstractFruitSort bfs,mfs,sfs;
		bfs=new BigFruitSorting(9);
		mfs=new MidFruitSorting(5);
		sfs=new MinFruitSorting(2);
		
		//将它们连起来
		bfs.setNextSort(mfs);//大串中
		mfs.setNextSort(sfs);//中串小
		
		Random rm=new Random();
		for(int i=0;i<1000;i++) {
			int weight=rm.nextInt(10);
			bfs.sendFruit(weight, "橙子");
		}
		bfs.getFruitBox();
		mfs.getFruitBox();
		sfs.getFruitBox();
	}
}
