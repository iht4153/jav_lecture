package com.urdomain.ch09;

public class Window {
	Button2 button1 = new Button2();
	Button2 button2 = new Button2();
	
	//필드 초기값으로 대입
	Button2.OnClickListener listener = new Button2.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		button1.setOnClickListener( listener );
		button2.setOnClickListener( new Button2.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
