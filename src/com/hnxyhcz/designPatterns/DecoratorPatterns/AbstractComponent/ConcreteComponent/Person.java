package com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent;

/**
 * person类
 * @author hnxyhcz
 *
 */
public class Person {
	public Person() {};
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void Show() {
		System.out.println("装扮的"+name);
	}
}
