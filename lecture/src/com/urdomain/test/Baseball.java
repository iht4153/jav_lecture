package com.urdomain.test;

public class Baseball {
	// 이건 그 어플숙제 내주셨던거요. 어플실행과정?
	// 아하 이것도 //일단 한글로 주석 달아보세요. 저번에 한것처럼 속성과 동작.
	// 속성은 필드고 동작은 메소드로 바뀔거에요. 네 알겠습니다.. 내용이 너무 가난해서 부끄럽네요 ㅠㅠ
	// 부끄러워 하실필요없어요. 자신감있게 코딩하세요! 오류만 잡을게요.
	// 필드
	int iScore;
	String team; 
	// 이렇게 진행하시면 될거같아요. 네 참고하겠습니다. 모르거나 도움필요하시면 적극적으로 물어봐주세요.
	// 지금 안따라오시면 늦어용. 늦기전에! 네 알겠습니다!! ㅠㅠ 감사해요!넹! 팀뷰어 종료할게요.넹

	// 생성자
	public Baseball() {
		this.team = null;
	}

	public Baseball(String team) {
		this.team = team;
	}

	// 메소드
	void setScore(int _iScore) {
		this.iScore = _iScore;
	}

	int getScore() {
		return this.iScore;
	}

}
