package com.urdomain.ch09;

public class Anonymous1Example {
	public static void main(String[] args) {
		Anonymous1 anony = new Anonymous1();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}
				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}
			}
		);
	}
}
