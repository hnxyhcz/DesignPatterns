package com.hnxyhcz.designPatterns.DecoratorPatterns.Entity;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.TheGreatestSage;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.Decorator.Change;

/**
 * 具体装饰角色："树"
 * @author hnxyhcz
 *
 */
public class Tree extends Change{

	public Tree(TheGreatestSage sage) {
		super(sage);
	}
	
	public void move() {
		super.move();
		System.out.println("Tree Move");
	}

}
