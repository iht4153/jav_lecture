package com.urdomain.ch12;

public class ThreadA1 extends Thread {
	public ThreadA1() {
		setName("ThreadA1");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
