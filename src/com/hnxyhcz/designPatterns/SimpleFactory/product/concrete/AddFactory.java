package com.hnxyhcz.designPatterns.SimpleFactory.product.concrete;

import com.hnxyhcz.designPatterns.SimpleFactory.creator.Operator;
import com.hnxyhcz.designPatterns.SimpleFactory.creator.concrete.OperatorAdd;
import com.hnxyhcz.designPatterns.SimpleFactory.product.IFactory;

/**
 * 具体工厂角色
 * @author hnxyhcz
 *
 */
public class AddFactory implements IFactory {

	@Override
	public Operator createOperator() {
		return new OperatorAdd();
	}

}
