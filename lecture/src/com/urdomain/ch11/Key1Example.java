package com.urdomain.ch11;

import java.util.HashMap;

public class Key1Example {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key1, String> hashMap = new HashMap<Key1, String>();
		
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key1(1), "홍길동");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key1(1));
		System.out.println(value);
	}
}
