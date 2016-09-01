package com.hnxyhcz.designPatterns.strategyPattern.service;

/**
 * 现金收费抽象类
 * @author hnxyhcz
 *
 */
public abstract class CashSuper {
	/**
	 * 
	 * @param money 原价
	 * @return
	 */
	public abstract double acceptCash(double money);
}
