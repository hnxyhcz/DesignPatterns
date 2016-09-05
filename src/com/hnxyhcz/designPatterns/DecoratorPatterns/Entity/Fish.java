package com.hnxyhcz.designPatterns.DecoratorPatterns.Entity;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.TheGreatestSage;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.Decorator.Change;

/**
 * 具体装饰角色："鱼"
 * @author hnxyhcz
 *
 */
public class Fish extends Change{

	public Fish(TheGreatestSage sage) {
		super(sage);
	}
	
	public void move() {
		super.move();
		System.out.println("Fish Move");
	}

}
