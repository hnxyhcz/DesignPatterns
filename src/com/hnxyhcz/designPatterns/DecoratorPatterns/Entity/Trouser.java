package com.hnxyhcz.designPatterns.DecoratorPatterns.Entity;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent.Person;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.Decorator.Finery;

/**
 * 具体装饰角色：裤子
 * @author hnxyhcz
 *
 */
public class Trouser extends Finery {

	public Trouser(Person person) {
		super(person);
	}

	public void Show() {
		System.out.println("垮裤");
		super.Show();
	}
}
