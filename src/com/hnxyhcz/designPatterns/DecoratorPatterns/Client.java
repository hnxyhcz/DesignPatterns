package com.hnxyhcz.designPatterns.DecoratorPatterns;

import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.TheGreatestSage;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent.Monkey;
import com.hnxyhcz.designPatterns.DecoratorPatterns.AbstractComponent.ConcreteComponent.Person;
import com.hnxyhcz.designPatterns.DecoratorPatterns.Entity.Bird;
import com.hnxyhcz.designPatterns.DecoratorPatterns.Entity.Fish;
import com.hnxyhcz.designPatterns.DecoratorPatterns.Entity.Shoes;
import com.hnxyhcz.designPatterns.DecoratorPatterns.Entity.TShirts;
import com.hnxyhcz.designPatterns.DecoratorPatterns.Entity.Tree;

/**
 * 装饰模式示例代码
 * @author hnxyhcz
 *
 */
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
		
		// 服装装扮的例子
		Person person = new Person("小菜");
		Person tShirts = new TShirts(person);
		Person shoes = new Shoes(tShirts);
		
		shoes.Show();
	}
	
}
