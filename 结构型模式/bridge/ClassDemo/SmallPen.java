package com.qjm.bridge.ClassDemo;

public class SmallPen extends Pen{

	@Override
	public void draw(String name) {
		// TODO �Զ����ɵķ������
		String penType="С��ë�ʻ���";
		this.color.bepaint(penType, name);
	}

}
