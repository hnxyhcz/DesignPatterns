package com.hnxyhcz.designPatterns.strategyPattern.service.impl;

import com.hnxyhcz.designPatterns.strategyPattern.service.CashSuper;

/**
 * 返利收费
 * @author hnxyhcz
 *
 */
public class CashReturn extends CashSuper {
	
	private double moneyCondition = 0d;
	private double moneyReturn = 0d;
	
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		
		if(result >= moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
