package com.urdomain.test;

public class DongIl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 5;        // 메소드에 매개변수로 입력할 때 사용할 변수  
        int b = 6;        // 메소드에 매개변수로 입력할 때 사용할 변수 
        
        print2EnteredNumberTimesTable(a, b);
    }

    private static void print2EnteredNumberTimesTable(int _num1, int _num2) {
        System.out.println("*** " + _num1 + "단 ***");
        for (int n = 1; n <= 9; ++n) {
            System.out.println(_num1 + " x " + n + " = " + (_num1 * n));
        }

        System.out.println("*** " + _num2 + "단 ***");
        for (int n = 1; n <= 9; ++n) {
            System.out.println(_num2 + " x " + n + " = " + (_num2 * n));
        }
    }
}