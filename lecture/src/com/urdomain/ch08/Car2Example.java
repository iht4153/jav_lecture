package com.urdomain.ch08;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar2 = new Car2();
		
		myCar2.run();
		
		myCar2.tires[0] = new KumhoTire();
		myCar2.tires[1] = new KumhoTire();
		
		myCar2.run();
	}
}
