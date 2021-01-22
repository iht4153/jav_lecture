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
			int num = (int) (Math.random() * 45); // 45를 해야하는 이유가 이렇게 되면 0~44 숫자를 받을수있습니다. num을 사용하는 위치가 어딘가요?
			// lotto[num] index로 들어갑니다. 위에 new int[45];를 했기때문에 실질적으로 인덱스는 0~44가 할당되었습니다.
			// 그래서 45가 들어가면 length out 에러가 뜹니다. lotto[i] 에서 i가 0부터 시작해서
			// lotto[0] = lotto[랜덤한 index]; 이렇게 swap 하기 때문입니다.
			
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