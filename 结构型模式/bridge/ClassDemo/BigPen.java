package com.qjm.bridge.ClassDemo;

public class BigPen extends Pen{

	@Override
	public void draw(String name) {
		// TODO �Զ����ɵķ������
		String penType="���ë�ʻ���";
		this.color.bepaint(penType, name);
	}

}
