package com.urdomain.ch07;

public class SportsCar extends Car1 {
	@Override
	public void speedUp() { speed += 10; }
	
	//�������̵��� �� �� ����
	@Override
	public void stop() {	//stop �κп� final�� ����
		System.out.println("������ī�� ����");
		speed = 0;
	}

}
