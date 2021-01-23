package com.urdomain.ch09;

public class Anonymous3 {
	private int field;
	
	public void method(final int args1, int args2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20; (x)
		//arg2 = 20;
		
		//var1 = 30; (x)
		//var2 = 30; (x)
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
