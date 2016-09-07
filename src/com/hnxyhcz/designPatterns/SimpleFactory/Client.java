package com.hnxyhcz.designPatterns.SimpleFactory;

import com.hnxyhcz.designPatterns.SimpleFactory.creator.Operator;
import com.hnxyhcz.designPatterns.SimpleFactory.product.IFactory;
import com.hnxyhcz.designPatterns.SimpleFactory.product.OperatorFactory;
import com.hnxyhcz.designPatterns.SimpleFactory.product.concrete.AddFactory;

public class Client {

	public static void main(String[] args) {
		// 简单工厂模式
		Operator operator1 = null;
		operator1 = OperatorFactory.createOperator("/");
		operator1.setNumberA(6);
		operator1.setNumberB(4);
		try {
			double result = operator1.getResult();
			System.out.println("简单工厂模式：" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 工厂方法模式
		Operator operator2 = null;
		IFactory factory = new AddFactory();
		operator2 = factory.createOperator();
		operator2.setNumberA(6);
		operator2.setNumberB(4);
		try {
			double result = operator2.getResult();
			System.out.println("工厂方法模式：" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
