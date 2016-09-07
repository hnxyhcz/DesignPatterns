package com.hnxyhcz.designPatterns.SimpleFactory.product.concrete;

import com.hnxyhcz.designPatterns.SimpleFactory.creator.Operator;
import com.hnxyhcz.designPatterns.SimpleFactory.creator.concrete.OperatorSub;
import com.hnxyhcz.designPatterns.SimpleFactory.product.IFactory;

/**
 * 具体工厂角色
 * @author hnxyhcz
 *
 */
public class SubFactory implements IFactory {

	@Override
	public Operator createOperator() {
		return new OperatorSub();
	}

}
