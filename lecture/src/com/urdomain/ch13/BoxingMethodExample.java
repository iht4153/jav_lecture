package com.urdomain.ch13;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box2<Integer> box1 = Util1.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box2<String> box2 = Util1.boxing("ȫ�浿");
		String strValue = box2.get();
	}
}
