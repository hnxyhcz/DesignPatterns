package com.hnxyhcz.designPatterns.factoryMethod;

import com.hnxyhcz.designPatterns.factoryMethod.creator.Creator;
import com.hnxyhcz.designPatterns.factoryMethod.creator.concrete.ConcreteCreatorA;
import com.hnxyhcz.designPatterns.factoryMethod.creator.concrete.ConcreteCreatorB;
import com.hnxyhcz.designPatterns.factoryMethod.product.Product;

public class Client {
	
	private static Creator creator1, creator2;
	private static Product product1, product2;

	public static void main(String[] args) {
		creator1 = new ConcreteCreatorA();
		product1 = creator1.factory();
		
		creator2 = new ConcreteCreatorB();
		product2 = creator2.factory();
	}
}
