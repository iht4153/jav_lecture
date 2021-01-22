package com.urdomain.test;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 8;
		
		printEnteredNumberTimesTable(a, b);
	}
	
	private static void printEnteredNumberTimesTable(int _num1, int _num2) {
		System.out.println("*** " + _num1 + "단 ***");
		for (int m = 1; m <= 9; m++) { 
			System.out.println(_num1 + " x " + m + " = " + (_num1 * m));
		}
		
		System.out.println("*** " + _num2 + "단 ***");
		for (int n = 1; n <= 9; n++) { 
			System.out.println(_num2 + " x " + n + " = " + (_num2 * n));
		}
	}
}
					
//		for (int m = 2; m <= 9; m++) { 
//			System.out.println("*** " + m + "단 ***");
//			for (int n = 1; n <= 9; n++) { 
//				System.out.println(m + " x " + n + " = " + (m * n));
//			}
//		}
//	}
//		
//public class MultiplicationTable {
//	public static void main(String[] args) {
//		System.out.println("구구단을 외자");
//		System.out.println("--------------------");
//	int sum = 1;
//	for (int i=1; i<=10; i++) {
//		sum = sum * i;
//		}
//	System.out.println("2*1 = " + sum);
//	}
//}
