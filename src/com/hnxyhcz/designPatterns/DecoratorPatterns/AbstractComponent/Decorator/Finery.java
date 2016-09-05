package com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.Decorator;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent.Person;

/**
 * 服装装饰类（Decorator）
 * @author hnxyhcz
 *
 */
public class Finery extends Person {

	protected Person person;

	public Finery(Person person) {
		this.person = person;
	}
	
	public void Show() {
		if(person != null) {
			person.Show();
		}
	}
}
