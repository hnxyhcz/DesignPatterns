package com.hnxyhcz.designPatterns.ProxyPatterns.proxy;

import com.hnxyhcz.designPatterns.ProxyPatterns.SchoolGirl;
import com.hnxyhcz.designPatterns.ProxyPatterns.realSubject.Pursuit;
import com.hnxyhcz.designPatterns.ProxyPatterns.subject.GiveGift;

/**
 * 代理对象角色：代理类
 * @author hnxyhcz
 *
 */
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
