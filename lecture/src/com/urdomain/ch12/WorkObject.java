package com.urdomain.ch12;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA3�� methodA() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB3�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
