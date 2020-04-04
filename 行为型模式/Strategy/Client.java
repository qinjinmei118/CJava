package com.qjm.Strategy;

public class Client {
	public static void main(String args[]) {
		ICutFruit cf=new FruitKnife();
		Chef chef=new Chef();
		chef.SetCutMethod(cf);
		chef.CutFruit("³È×Ó");
		
		ICutFruit cf1=new MultiBlade();
		chef.SetCutMethod(cf1);
		chef.CutFruit("Æ»¹û");
		
		ICutFruit cf2=new HoriBlade();
		chef.SetCutMethod(cf2);
		chef.CutFruit("Ïã½¶");
	}
}
