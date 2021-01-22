package com.urdomain.ch06;

public class StudentExample {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		@SuppressWarnings("unused")
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		// 잘하시고 계신거같은데요? 감사합니다! 질문 하실거나. 도움 필요한거있으면 말씀해주세요. 이해안되거나
		//오류난것들은 책에서 컴파일 에러라고 떠있는거여서 바르게 수정한걸로 써주신거같은데
		//다른것들이 왜 오류 났었는지 모르겠어요 그. 노란색밑줄? 뭔가용 아 그건 경고 문구인데요.
		//자바 컴파일러가 사용하지않는 변수 등은 너 이거 선언했는데 사용안했어. 이런 문구를 알려주는 용도에요. 오류는 아니고 경고.
		//그럼 동일님이 그 부분 사용해주셔서 경고가 정리된거네요? 아녀 사용은 안하고 너 경고 무시할거야. 하고 이노테이션을 달아놓은거에요. 
		
		//보기 안좋아서 아하.! 제가 근데 과제든 뭘 해야 질문드릴수있을거같아요 ㅜㅜ 일단 한국말로 적어보세요. 물리 객체 
		// 어떤걸 만들고싶으세요? 저는 그 예전 다마고치? 그런거여. 그럼 클래스 이름을 public class 다마고치 영어가 뭐죵/ ㅋ 그렇게 지으시고.네
		//숙제 하는 패키지 어딨나요? 저기는 새로 친거고 원래가
	}
}