package com.qjm.zeren_Chain;

public class MidFruitSorting extends AbstractFruitSort{

	public MidFruitSorting(int weight) {
		super(weight);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO �Զ����ɵķ������
		fruitBox.add("ˮ����ͷ��"+fruit);
	}

}
