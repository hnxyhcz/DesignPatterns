package com.hnxyhcz.designPatterns.DecoratorPatterns;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.TheGreatestSage;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent.Monkey;
import com.hnxyhcz.designPatterns.DecoratorPatterns.Entity.Bird;
import com.hnxyhcz.designPatterns.DecoratorPatterns.Entity.Fish;
import com.hnxyhcz.designPatterns.DecoratorPatterns.Entity.Tree;

public class Client {
	
	public static void main(String[] args) {
		// 孙悟空72变的例子
		// 第一种写法
		TheGreatestSage sage = new Monkey();
		
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage tree = new Tree(bird);
		
		tree.move();
		
		// 第二种写法
		TheGreatestSage fish = new Fish(new Bird(new Monkey()));
		fish.move();
		
	}
	
}
