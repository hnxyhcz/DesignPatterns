package com.hnxyhcz.designPatterns.strategyPattern.service.impl;

import com.hnxyhcz.designPatterns.strategyPattern.service.CashSuper;

/**
 * 正常收费子类
 * @author hnxyhcz
 *
 */
public class CashNormal extends CashSuper{

	/**
	 * 正常收费，原价返回
	 */
	public double acceptCash(double money) {
		return money;
	}
	
}
