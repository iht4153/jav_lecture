package com.urdomain.ch07;

public class Car3Example {
	public static void main(String[] args) {
		Car3 car = new Car3();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire�� ��ü");
				car.tires[problemLocation-1] =
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("--------------------------------");
		}
	}
}
