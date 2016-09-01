package com.hnxyhcz.designPatterns.strategyPattern.factory;

import com.hnxyhcz.designPatterns.strategyPattern.service.CashSuper;
import com.hnxyhcz.designPatterns.strategyPattern.service.impl.CashNormal;
import com.hnxyhcz.designPatterns.strategyPattern.service.impl.CashRebate;
import com.hnxyhcz.designPatterns.strategyPattern.service.impl.CashReturn;

/**
 * @author hnxyhcz
 *
 */
public class CashContext {

	// 声明一个CashSuper对象
	private CashSuper cs = null;

	// 通过构造方法，传入具体的收费策略
	public CashContext(String type) {
		
		switch (type) {
			case "正常收费" :
				cs = new CashNormal();
				break;
				
			case "满300返100" :
				cs = new CashReturn("300", "100");
				break;
				
			case "打8折" :
				cs = new CashRebate("0.8");
				break;
		}
	}
	
	// 根据收费策略的不同，获得计算结果
	public double GetResult(double money) {
		return cs.acceptCash(money);
	}
	
	
	
}
