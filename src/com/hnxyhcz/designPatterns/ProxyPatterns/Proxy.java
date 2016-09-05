package com.hnxyhcz.designPatterns.ProxyPatterns;

public class Proxy implements GiveGift {
	
	public Pursuit boy;
	
	public Proxy(SchoolGirl girl) {
		this.boy = new Pursuit(girl);
	}

	public void GiveDolls() {
		boy.GiveDolls();
	}
	
	public void GiveFlowers() {
		boy.GiveFlowers();
	}
	
	public void GiveChocolate() {
		boy.GiveChocolate();
	}
}
