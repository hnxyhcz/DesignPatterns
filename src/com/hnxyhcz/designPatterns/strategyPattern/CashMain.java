package com.hnxyhcz.designPatterns.strategyPattern;

import com.hnxyhcz.designPatterns.strategyPattern.domain.Cash;
import com.hnxyhcz.designPatterns.strategyPattern.factory.CashContext;

/**
 * 策略模式代码
 * @author hnxyhcz
 *
 */
public class CashMain {

	double total = 0d;
	
	private void btnOk_Click(Cash cash) {
		double totalPrices = 0d;
		
		// CashSuper csuper = CashFactory.createCashAccept(cash.getType());
		// totalPrices = csuper.acceptCash(Double.parseDouble(cash.getPrice()) * Double.parseDouble(cash.getNumber()));
		
		CashContext csuper = new CashContext(cash.getType());
		totalPrices = csuper.GetResult(Double.parseDouble(cash.getPrice()) * Double.parseDouble(cash.getNumber()));
		

		total += totalPrices;
		
		System.out.println("单价：" + cash.getPrice() + " 数量：" + cash.getNumber() + " 合计： " + totalPrices);
	}
	
	public static void main(String[] args) {
		
		Cash cash = new Cash();
		cash.setNumber("15");
		cash.setPrice("25");
		cash.setType(Cash.CASH_NORMAL);
		
		CashMain cashMain = new CashMain();
		cashMain.btnOk_Click(cash);
		
	}
	
}
