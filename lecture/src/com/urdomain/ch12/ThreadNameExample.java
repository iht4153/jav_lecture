package com.urdomain.ch12;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA1 threadA = new ThreadA1();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB1 threadB = new ThreadB1();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}
