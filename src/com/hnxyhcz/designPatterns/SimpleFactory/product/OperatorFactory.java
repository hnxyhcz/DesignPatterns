package com.hnxyhcz.designPatterns.SimpleFactory.product;

import com.hnxyhcz.designPatterns.SimpleFactory.creator.Operator;
import com.hnxyhcz.designPatterns.SimpleFactory.creator.concrete.OperatorAdd;
import com.hnxyhcz.designPatterns.SimpleFactory.creator.concrete.OperatorDiv;
import com.hnxyhcz.designPatterns.SimpleFactory.creator.concrete.OperatorMul;
import com.hnxyhcz.designPatterns.SimpleFactory.creator.concrete.OperatorSub;

/**
 * 工厂角色类
 * @author hnxyhcz
 *
 */
public class OperatorFactory {

	public static Operator createOperator(String operator) {
		
		Operator oper = null;
		
		if("+".equals(operator)) {
			oper = new OperatorAdd();
		} else if("-".equals(operator)) {
			oper = new OperatorSub();
		} else if("*".equals(operator)) {
			oper = new OperatorMul();
		} else if("/".equals(operator)) {
			oper = new OperatorDiv();
		}
		
		return oper;
	}
}
