package com.hnxyhcz.designPatterns.ProxyPatterns;

/**
 * 追求者类
 * @author hnxyhcz
 *
 */
public class Pursuit implements GiveGift {
	
	public SchoolGirl girl;
	
	public Pursuit(SchoolGirl girl) {
		this.girl = girl;
	}

	public void GiveDolls() {
		System.out.println(girl.getName() + "送你娃娃");
	}
	
	public void GiveFlowers() {
		System.out.println(girl.getName() + "送你鲜花");
	}
	
	public void GiveChocolate() {
		System.out.println(girl.getName() + "送你巧克力");
	}
}
