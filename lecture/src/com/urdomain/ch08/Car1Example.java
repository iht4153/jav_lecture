package com.urdomain.ch08;

public class Car1Example {
	public static void main(String[] args) {
		Car1 myCar1 = new Car1();
		
		myCar1.run();
		
		myCar1.frontLeftTire = new KumhoTire();
		myCar1.frontRightTire = new KumhoTire();
		
		myCar1.run();
	}
}
