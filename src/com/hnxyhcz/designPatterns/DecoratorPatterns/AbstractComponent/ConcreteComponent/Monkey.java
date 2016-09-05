package com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.TheGreatestSage;

/**
 * 具体构件角色：大圣的本体 类
 * @author hnxyhcz
 *
 */
public class Monkey implements TheGreatestSage{

	@Override
	public void move() {
		System.out.println("Monkey Move");
	}

	
}
