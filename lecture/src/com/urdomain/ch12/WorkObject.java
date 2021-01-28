package com.urdomain.ch12;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA3의 methodA() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB3의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
