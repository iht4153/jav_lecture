package com.urdomain.ch09;

import com.urdomain.ch09.Button1.OnClickListener;

public class Button2 {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
