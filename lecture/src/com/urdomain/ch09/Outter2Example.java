package com.urdomain.ch09;

import com.urdomain.ch09.Outter2.Nested;

public class Outter2Example {
	public static void main(String[] args) {
		Outter2 outter = new Outter2();
		Outter2.Nested nested = outter.new Nested();
		nested.print();
	}
}
