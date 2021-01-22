package com.urdomain.ch06;

public class Car2Example {
	public static void main(String[] args) {
		// 객체 생성
		Car2 myCar = new Car2("검정", 3000);
		// Car myCar = new Car(); (X)기본 생성자를 호출할 수 없다.

		System.out.println(myCar.color + "  " + myCar.cc);
	}
}