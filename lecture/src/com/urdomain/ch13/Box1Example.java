package com.urdomain.ch13;

public class Box1Example {
	public static void main(String[] args) {
		Box1 box = new Box1();
		box.set("ȫ�浿");					// String -> Object (�ڵ� Ÿ�� ��ȯ)
		String name = (String) box.get();	// Object -> String (���� Ÿ�� ��ȯ)
		
		box.set(new Apple());				// Apple -> Object (�ڵ� Ÿ�� ��ȯ)
		Apple apple = (Apple) box.get();	// Object -> Apple (���� Ÿ�� ��ȯ)
	}
}
