package com.factory.cn;

import com.product.cn.GamePlayer;
import com.product.cn.PlayerProduct1;

public class PlayerFactory1 extends FactoryGamePlayer{

	@Override
	public GamePlayer getNewPlayer() {
		System.out.println("��ɫ����1����---����ɫ��Ʒ1");
		return new PlayerProduct1();
	}

}
