package com.urdomain.ch07;

public class SportsCar extends Car1 {
	@Override
	public void speedUp() { speed += 10; }
	
	//오버라이딩을 할 수 없음
	@Override
	public void stop() {	//stop 부분에 final이 들어가서
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}

}
