package com.urdomain.ch06;

public class Car2Example {
	public static void main(String[] args) {
		// ��ü ����
		Car2 myCar = new Car2("����", 3000);
		// Car myCar = new Car(); (X)�⺻ �����ڸ� ȣ���� �� ����.

		System.out.println(myCar.color + "  " + myCar.cc);
	}
}