package com.urdomain.test;

public class DongIl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 5;        // �޼ҵ忡 �Ű������� �Է��� �� ����� ����  
        int b = 6;        // �޼ҵ忡 �Ű������� �Է��� �� ����� ���� 
        
        print2EnteredNumberTimesTable(a, b);
    }

    private static void print2EnteredNumberTimesTable(int _num1, int _num2) {
        System.out.println("*** " + _num1 + "�� ***");
        for (int n = 1; n <= 9; ++n) {
            System.out.println(_num1 + " x " + n + " = " + (_num1 * n));
        }

        System.out.println("*** " + _num2 + "�� ***");
        for (int n = 1; n <= 9; ++n) {
            System.out.println(_num2 + " x " + n + " = " + (_num2 * n));
        }
    }
}