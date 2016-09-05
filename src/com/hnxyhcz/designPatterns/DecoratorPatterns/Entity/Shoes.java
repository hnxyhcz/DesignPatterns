package com.hnxyhcz.designPatterns.DecoratorPatterns.Entity;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent.Person;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.Decorator.Finery;

/**
 * 具体装饰角色：鞋子
 * @author hnxyhcz
 *
 */
public class Shoes extends Finery {

	public Shoes(Person person) {
		super(person);
	}

	public void Show() {
		System.out.println("鞋");
		super.Show();
	}
}
