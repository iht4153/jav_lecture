package com.urdomain.ch08;

public class DriverExample {
	public static void main(String[] args) {
		Driver1 driver = new Driver1();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
