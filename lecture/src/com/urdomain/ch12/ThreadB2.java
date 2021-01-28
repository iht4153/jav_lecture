package com.urdomain.ch12;

public class ThreadB2 extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB2 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB2 종료");
	}
}
