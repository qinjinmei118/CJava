package com.qjm.zeren_Chain;

public class MinFruitSorting extends AbstractFruitSort{

	public MinFruitSorting(int weight) {
		super(weight);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO �Զ����ɵķ������
		fruitBox.add("��ˮ��֭��"+fruit);
	}

}
