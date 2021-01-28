package com.urdomain.ch12;

public class User2 extends Thread {
	private Calculator1 calculator;

	public void setCalculator(Calculator1 calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
