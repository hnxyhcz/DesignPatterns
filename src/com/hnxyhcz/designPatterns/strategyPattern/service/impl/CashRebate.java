package com.hnxyhcz.designPatterns.strategyPattern.service.impl;

import com.hnxyhcz.designPatterns.strategyPattern.service.CashSuper;

/**
 * 打折收费子类
 * @author hnxyhcz
 *
 */
public class CashRebate extends CashSuper{
	
	/**
	 * 折扣率
	 */
	private double moneyRebate = 1d;
	
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}
}
