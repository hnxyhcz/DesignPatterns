package com.hnxyhcz.designPatterns.SimpleFactory;

import com.hnxyhcz.designPatterns.SimpleFactory.creator.Operator;
import com.hnxyhcz.designPatterns.SimpleFactory.product.OperatorFactory;

public class Client {

	public static void main(String[] args) {
		Operator operator = null;
		operator = OperatorFactory.createOperator("/");
		operator.setNumberA(6);
		operator.setNumberB(4);
		try {
			double result = operator.getResult();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
