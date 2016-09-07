package com.hnxyhcz.designPatterns.factoryMethod.creator.concrete;

import com.hnxyhcz.designPatterns.factoryMethod.creator.Creator;
import com.hnxyhcz.designPatterns.factoryMethod.product.Product;
import com.hnxyhcz.designPatterns.factoryMethod.product.concrete.ConcreteProductA;

/**
 * 具体工厂角色
 * @author hnxyhcz
 *
 */
public class ConcreteCreatorA implements Creator {

	@Override
	public Product factory() {
		return new ConcreteProductA();
	}

}
