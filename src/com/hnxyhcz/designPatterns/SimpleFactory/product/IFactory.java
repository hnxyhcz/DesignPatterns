package com.hnxyhcz.designPatterns.SimpleFactory.product;

import com.hnxyhcz.designPatterns.SimpleFactory.creator.Operator;

/**
 * 抽象工厂角色（工厂方法模式）
 * @author hnxyhcz
 *
 */
public interface IFactory {

	public Operator createOperator();
}
