package com.urdomain.ch08;

public interface RemoteControl {
<<<<<<< HEAD
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
		
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
		
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
=======
		//상수
		public int MAX_VOLUME = 10;
		public int MIN_VOLUME = 0;
		
		//추상 메소드
		public void turnOn();
		public void turnOff();
		public void setVolume(int volume);
		
		//디폴트 메소드
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음 처리합니다.");
			} else {
				System.out.println("무음 해제합니다.");
			}
		}
		
		//정적 메소드
		static void changeBattery() {
			System.out.println("건전지를 교환합니다.");
>>>>>>> branch 'main' of https://github.com/iht4153/jav_lecture.git
		}
	}
<<<<<<< HEAD
		
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
=======
>>>>>>> branch 'main' of https://github.com/iht4153/jav_lecture.git
