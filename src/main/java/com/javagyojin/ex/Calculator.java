package com.javagyojin.ex;

public class Calculator {

	public void add(int firstNumber, int secondNumber) {
		System.out.println("add �޼ҵ� ����");
		int result = firstNumber + secondNumber;
		System.out.println(firstNumber + "+" + secondNumber + "=" + result);
	}
	
	public void sub(int firstNumber, int secondNumber) {
		System.out.println("sub �޼ҵ� ����");
		int result = firstNumber - secondNumber;
		System.out.println(firstNumber + "-" + secondNumber + "=" + result);
	}
	
	public void multi(int firstNumber, int secondNumber) {
		System.out.println("multi �޼ҵ� ����");
		int result = firstNumber * secondNumber;
		System.out.println(firstNumber + "*" + secondNumber + "=" + result);
	}
	
	public void div(int firstNumber, int secondNumber) {
		System.out.println("div �޼ҵ� ����");
		int result = firstNumber / secondNumber;
		System.out.println(firstNumber + "/" + secondNumber + "=" + result);
	}
	
	
	
}
