package com.urdomain.ch07.package2;

import com.urdomain.ch07.package1.A;

public class C {
	public void method() {
		A a = new A();		// (x)
		a.field = "value";	// (x)
		a.method();			// (x)
	}

}
