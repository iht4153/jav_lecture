package com.urdomain.test;

public class Test10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		객체 생성 : 지금은 그냥 넘어가세요
		Test10 test10 = new Test10();
		String name ="Tony";
		int phoneNum = 0;
		String resultPositionStr = "";
//		test10.getPhoneNumber() 함수 호출/사용
		phoneNum = test10.getPhoneNumber(name);
//		test10.printConsole() 함수 호출/사용
		test10.printConsoleForInt(phoneNum);
//		test10.checkPosition() 함수 호출/사용
		resultPositionStr = test10.checkPosition(name);
//		test10.printConsoleForString() 함수 호출/사용
		test10.printConsoleForString(resultPositionStr);
	}
//	함수 선언
//	input: 이름, output: 전화번호 뒷에 4자리
	public int getPhoneNumber (String urName) {
		// 리턴형 타입이 int로 선언 되어 있는 관계로 숫자만 넘깁니다.
		return 7570;
	}
//	함수 선언
//	input: 정수형 : output: 없음
	public void printConsoleForInt (int num) {
		System.out.println(num);
	}
//	함수 선언
//	input: 문자열 : output: 없음
	public void printConsoleForString (String str) {
		System.out.println(str);
	}
//	함수 선언
//	input: 문자열 : output: 문자열
	public String checkPosition (String position) {
		String resultStr = "";
		if(position == "Tony") {
			resultStr = "나는 멋진 선생님 !";
		} else {
			resultStr = "나는 예쁜/잘생긴 학생 !!";
		}
		return resultStr;
	}
}