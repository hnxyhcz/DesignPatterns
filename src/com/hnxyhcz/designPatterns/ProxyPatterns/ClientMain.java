package com.hnxyhcz.designPatterns.ProxyPatterns;

public class ClientMain {

	public static void main(String[] args) {
		SchoolGirl mm = new SchoolGirl();
		mm.setName("李娇娇");
		
		Proxy proxy = new Proxy(mm);
		proxy.GiveDolls();
		proxy.GiveFlowers();
		proxy.GiveChocolate();
	}
}
