package com.qjm.Strategy;
//���ڳ�ʦ����
public class Chef {
	private ICutFruit cutmethods;
	public void SetCutMethod(ICutFruit cutmethod) {
		this.cutmethods=cutmethod;
	}
	public void CutFruit(String fruitName) {
		cutmethods.CutStrategy(fruitName);
	}
}
