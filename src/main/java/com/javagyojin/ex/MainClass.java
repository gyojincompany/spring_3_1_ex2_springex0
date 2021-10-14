package com.javagyojin.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {

//		MyCalculator calcu = new MyCalculator();
//		
//		calcu.setCalcu(new Calculator());
//		calcu.setFirstNumber(10);
//		calcu.setSecondNumber(5);
//		
//		calcu.addition();
//		calcu.subtraction();
//		calcu.multiplication();
//		calcu.division();
	
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator calcu = ctx.getBean("myCalcu", MyCalculator.class);
		
		calcu.addition();
		calcu.subtraction();
		calcu.multiplication();
		calcu.division();
		
		ctx.close();
		
	}
	
	
}