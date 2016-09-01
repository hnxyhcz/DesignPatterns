package com.hnxyhcz.designPatterns.strategyPattern.factory;

import com.hnxyhcz.designPatterns.strategyPattern.service.CashSuper;
import com.hnxyhcz.designPatterns.strategyPattern.service.impl.CashNormal;
import com.hnxyhcz.designPatterns.strategyPattern.service.impl.CashRebate;
import com.hnxyhcz.designPatterns.strategyPattern.service.impl.CashReturn;

/**
 * 现金收费工厂
 * @author hnxyhcz
 *
 */
public class CashFactory {

	/**
	 * 
	 * @param type
	 * @return
	 */
	public static CashSuper createCashAccept(String type) {
		CashSuper cs = null;
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
		return cs;
	}
	
}
