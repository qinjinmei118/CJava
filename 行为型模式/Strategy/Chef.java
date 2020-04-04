package com.qjm.Strategy;
//对于厨师而言
public class Chef {
	private ICutFruit cutmethods;
	public void SetCutMethod(ICutFruit cutmethod) {
		this.cutmethods=cutmethod;
	}
	public void CutFruit(String fruitName) {
		cutmethods.CutStrategy(fruitName);
	}
}
