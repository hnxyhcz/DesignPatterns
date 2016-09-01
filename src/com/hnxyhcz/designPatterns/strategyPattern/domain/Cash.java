package com.hnxyhcz.designPatterns.strategyPattern.domain;

public class Cash {
	public final static String CASH_NORMAL = "正常收费";
	public final static String CASH_REBATE = "打8折";
	public final static String CASH_RETURN = "满300返100";

	private String type;
	private String price;
	private String number;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
}
