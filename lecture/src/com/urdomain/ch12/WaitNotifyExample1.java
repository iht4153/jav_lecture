package com.urdomain.ch12;

public class WaitNotifyExample1 {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadA3 threadA = new ThreadA3(sharedObject);
		ThreadB3 threadB - new ThreadB3(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
