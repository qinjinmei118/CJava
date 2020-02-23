package com.factory.cn;

import com.product.cn.GamePlayer;
import com.product.cn.PlayerProduct2;

public class PlayerFactory2 extends FactoryGamePlayer{

	@Override
	public GamePlayer getNewPlayer() {
		System.out.println("��ɫ����2����---����ɫ2");
		return new PlayerProduct2();
	}

}
