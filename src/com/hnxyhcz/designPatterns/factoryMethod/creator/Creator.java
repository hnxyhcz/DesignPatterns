package com.hnxyhcz.designPatterns.factoryMethod.creator;

import com.hnxyhcz.designPatterns.factoryMethod.product.Product;

/**
 * 抽象工厂角色
 * @author hnxyhcz
 *
 */
public interface Creator {

	public Product factory();
}
