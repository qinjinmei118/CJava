package com.factory.cn;

import com.product.cn.GamePlayer;
import com.product.cn.PlayerProduct1;

public class PlayerFactory1 extends FactoryGamePlayer{

	@Override
	public GamePlayer getNewPlayer() {
		System.out.println("角色工厂1生产---》角色产品1");
		return new PlayerProduct1();
	}

}
