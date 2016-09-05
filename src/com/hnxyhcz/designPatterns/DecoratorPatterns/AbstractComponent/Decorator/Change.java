package com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.Decorator;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.TheGreatestSage;

/**
 * 抽象装饰角色：七十二般变化
 * @author hnxyhcz
 *
 */
public class Change implements TheGreatestSage {
	
	private TheGreatestSage sage;
	
	public Change(TheGreatestSage sage) {
		super();
		this.sage = sage;
	}

	@Override
	public void move() {
		if(sage != null) {
			sage.move();
		}
	}

}
