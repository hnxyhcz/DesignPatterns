package com.hnxyhcz.designPatterns.SimpleFactory.creator;

/**
 * 抽象计算操作
 * @author hnxyhcz
 *
 */
public abstract class Operator {

	protected double numberA = 0d;
	
	protected double numberB = 0d;
	
	public double getNumberA() {
		return numberA;
	}
	
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	
	public double getNumberB() {
		return numberB;
	}
	
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	public abstract double getResult() throws Exception;
}
