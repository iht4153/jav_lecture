package com.urdomain.ch09;

import com.urdomain.ch09.A1.B;

public class Main1 {
	public static void main(String[] args) {
		A1 a = new A1();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A1.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A1.C c = new A1.C();
		c.field1 = 3;
		c.method1();
		A1.C.field2 = 3;
		A1.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
