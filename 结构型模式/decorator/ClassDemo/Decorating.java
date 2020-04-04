package com.qjm.decorator.ClassDemo;

public class Decorating implements IBirthdayCake {
	private IBirthdayCake birthdayCake;
	public Decorating(IBirthdayCake birthdayCake) {
		this.birthdayCake=birthdayCake;
	}

	@Override
	public void show() {
		// TODO �Զ����ɵķ������
		birthdayCake.show();
	}

}
