package com.urdomain.ch12;

public class ThreadA2 extends Thread {
	public boolean stop = false;	//���� �÷���
	public boolean work = true;		//�۾� ���� ���� �÷���
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA2 �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA2 ����");
	}
}
