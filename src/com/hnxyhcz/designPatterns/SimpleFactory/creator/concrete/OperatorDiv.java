package com.hnxyhcz.designPatterns.SimpleFactory.creator.concrete;

import com.hnxyhcz.designPatterns.SimpleFactory.creator.Operator;

/**
 * 除法类
 * @author hnxyhcz
 *
 */
public class OperatorDiv extends Operator{

	@Override
	public double getResult() throws Exception {
		double result = 0d;
		if(numberB == 0) {
			throw new Exception("除数不能为0");
		}
		result = numberA / numberB;
		return result;
	}

}
