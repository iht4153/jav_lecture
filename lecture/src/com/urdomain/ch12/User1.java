package com.urdomain.ch12;

public class User1 extends Thread {
	private Calculator1 calculator;
	
	public void setCalculator(Calculator1 calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
