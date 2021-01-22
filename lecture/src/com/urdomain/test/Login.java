package com.urdomain.test;

public class Login {
	public static void main(String[] args) {
		
		String[] user = {"imae", "12341234"}; // 0, 1
		
		String inputId = "imae";
		String inputPw = "12341234";
		
		if(inputId == user[0] && inputPw == user[1]) { 
//		if(user[0].equals(inputId) && user[1].equals(inputPw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}