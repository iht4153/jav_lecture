package com.urdomain.ch12;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		ThreadA1 threadA = new ThreadA1();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();
		
		ThreadB1 threadB = new ThreadB1();
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();
	}
}
