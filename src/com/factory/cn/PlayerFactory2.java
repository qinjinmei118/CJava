package com.factory.cn;

import com.product.cn.GamePlayer;
import com.product.cn.PlayerProduct2;

public class PlayerFactory2 extends FactoryGamePlayer{

	@Override
	public GamePlayer getNewPlayer() {
		System.out.println("角色工厂2生产---》角色2");
		return new PlayerProduct2();
	}

}
