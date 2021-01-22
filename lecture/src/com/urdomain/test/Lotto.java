package com.urdomain.test;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[45];
		for (int i = 0; i < 45; ++i) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < 6; ++i) {
			int num = (int) (Math.random() * 45); // 45�� �ؾ��ϴ� ������ �̷��� �Ǹ� 0~44 ���ڸ� �������ֽ��ϴ�. num�� ����ϴ� ��ġ�� ��򰡿�?
			// lotto[num] index�� ���ϴ�. ���� new int[45];�� �߱⶧���� ���������� �ε����� 0~44�� �Ҵ�Ǿ����ϴ�.
			// �׷��� 45�� ���� length out ������ ��ϴ�. lotto[i] ���� i�� 0���� �����ؼ�
			// lotto[0] = lotto[������ index]; �̷��� swap �ϱ� �����Դϴ�.
			
			//swap
			int tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = tmp;
		}
		int[] arr1 = Arrays.copyOfRange(lotto, 0, 6);
		for (int i = 0; i < 6; ++i) {
			System.out.print(arr1[i] + "\t");
		}
	}
}