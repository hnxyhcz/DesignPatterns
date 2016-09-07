package com.hnxyhcz.designPatterns.SimpleFactory.creator.concrete;

import com.hnxyhcz.designPatterns.SimpleFactory.creator.Operator;

/**
 * 乘法类
 * @author hnxyhcz
 *
 */
public class OperatorMul extends Operator{

	@Override
	public double getResult() {
		double result = 0d;
		result = numberA * numberB;
		return result;
	}

}
