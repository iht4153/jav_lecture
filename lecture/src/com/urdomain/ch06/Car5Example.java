package com.urdomain.ch06;

public class Car5Example {
	public static void main(String[] args) {
		Car5 myCar = new Car5();
		
		myCar.setGas(5);	//Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();	//Car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();	//Car�� isLeftGas() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {	//Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}