package com.urdomain.ch09;

public class ButtonExample {
	public static void main(String[] args) {
		Button1 btn = new Button1();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
