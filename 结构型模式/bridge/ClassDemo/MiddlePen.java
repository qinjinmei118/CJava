package com.qjm.bridge.ClassDemo;

public class MiddlePen extends Pen{

	@Override
	public void draw(String name) {
		// TODO �Զ����ɵķ������
		String penType="�к�ë�ʻ���";
		this.color.bepaint(penType, name);
	}

}
