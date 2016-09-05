package com.hnxyhcz.designPatterns.DecoratorPatterns.Entity;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.TheGreatestSage;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.Decorator.Change;

/**
 * 具体装饰角色："鸟"
 * @author hnxyhcz
 *
 */
public class Bird extends Change{

	public Bird(TheGreatestSage sage) {
		super(sage);
	}
	
	public void move() {
		super.move();
		System.out.println("Bird Move");
	}

}
