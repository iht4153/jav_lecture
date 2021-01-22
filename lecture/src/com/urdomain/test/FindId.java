package com.urdomain.test;

import java.util.Scanner;

public class FindId {

	static String[] db = { "tonytony", "1234" }; // 전역으로 String 배열로 만듦. 이유는 메소드에서 db를 사용해야하는데 
	// 아까처럼 메소드 안에서 생성해서 쓰게 되면, 메소드 호출할때마다 생겼다가 메소드 호출끝나면 삭제 되는 코드라 그냥 한번만 선언 및 정의 하려고 static으로 떄려버림. 

	public FindId() {
		
	}
	
	public static void main(String[] args) {
		
		// static이 없으면 객체를 생성해서 메소드를 호출해줘야되요. 지금 메소드를 호출하려면 이 메소드의 클래스를 생성해줘야하는데.
		// 클래스이름 변수명(마음대로) = new 클래스이름();// 즉 생성자  이런 형태로 인스턴스를 만들어줘야합니다.
		
		FindId fid = new FindId(); // 생성자라고 했는데 지금 생성자를 안만들어줬는데 호출 가능한건 자바가 기본적으로 만들어주기떄문인데 명시적으로 바꿔볼게요.
		// 이렇게 생성자를 만들어줘서 호출해주면되요. 이렇게 되면 fid에 생성된 객체가 대입된거에요.
		

		// 여기서 이해 안되시는 곳 말씀해주세요. 이것도 된건가요 네. static으로 하면 전역 메소드로 등록이 되서 객체 생성 없이
		// 호출할수있어요. 근데 이제 클래스를 배웠으니 웬만하면 안하는게 좋아요. 전역으로 뭔가 등록한다는거는 좀 지양해야하는 거라.

		Scanner sc = new Scanner(System.in); // 이건 콘솔창 입력받기 위한 Scanner 클래스. import 해서 사용해줘야함.
		String strInputData1 = sc.nextLine();  // 스캐너의 nextLine() 메소드를 호출한 부분인데. 이건, 콘솔에 문자열을 입력받으면 문자열을 return 해줌.
		// return 형은 무엇일까요? int 이런거.중에 하나. 하...문자열은 어떤 자료형을 쓴다고했죠? String? 네 맞아요. 한번 볼까요.
		// String을 반환해주죠?ㄴ ㅔ 네 이렇게 내부가 어떻게 구현됬을지 생각해보는 것도 좋은 방법이에요. 반환된 문자열을 저희가 만든 strInputData1에 대입해줬어요.
		
		String strInputData2 = sc.nextLine(); //이것도 똑같이
		
		// 그럼 지금 입력받은 문자열 두개를 각각의 변수가 들고있죠? 네 
		if (fid.loginProcess(strInputData1, strInputData2)) { //여기 보니깐 if문 조건식이 메소드가 들어갔는데. if 조건식은 true, false만 들어올수있어요.
			// 즉 boolean 만. 그래서 이 메소드는 boolean을 리턴해요. 
			System.out.println(db[0] + "님이 로그인 하셨습니다.");  // true가 되서 안으로 들어와서 syso이 출력된거에요. 넵. 문자열이 다르게 입력하면 실행 
			//안되겠죠? 네 // 그럼 또 다른거 봅시당.
		}
		// 생성된 객체 변수이름과 dot(연산자)를 이용해서 메소드를 호출할수있어요.//이해되셨나요?넵 

		sc.close();  // 사용했으면 close해줘서 닫아줘야함. 마지막에.
	}

	public boolean loginProcess(String id, String pw) { // static 메소드로 객체 생성없이도 호출 가능하게 해줬고, 매개변수 두개다 String을 받고있네요.

		boolean bResult = false;

		if (id.equals(db[0]) && pw.equals(db[1])) { //여긴 매개변수로 받은 id, pw 와 static db 랑 문자열 비교를 해줘서 맞으면 bResult = true; 를 넣어주는 용.
			bResult = true;
		} else {
			bResult = false;
		}

		return bResult; // boolean 반환형 메소드
	}
}
