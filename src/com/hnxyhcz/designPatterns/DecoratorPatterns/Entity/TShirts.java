package com.hnxyhcz.designPatterns.DecoratorPatterns.Entity;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent.Person;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.Decorator.Finery;

/**
 * 具体装饰角色：T恤
 * @author hnxyhcz
 *
 */
public class TShirts extends Finery {

	public TShirts(Person person) {
		super(person);
	}

	public void Show() {
		System.out.println("T恤");
		super.Show();
	}
}
