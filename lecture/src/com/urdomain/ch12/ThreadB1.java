package com.urdomain.ch12;

public class ThreadB1 extends Thread {
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
