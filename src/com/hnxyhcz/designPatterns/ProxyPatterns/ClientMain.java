package com.hnxyhcz.designPatterns.ProxyPatterns;

import com.hnxyhcz.designPatterns.ProxyPatterns.proxy.Proxy;

/**
 * 代理模式：张三让戴利替他向李娇娇送礼物
 * @author hnxyhcz
 *
 */
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
