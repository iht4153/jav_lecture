package com.urdomain.test;

//작성자 : 김동일
//구구단 2단부터 9단까지 출력 (3차원 배열로)
public class ThirdMultiple{
    private static final int MAX_SIZE = 10;

    private static void set3DArrayFromMultiplicationTable(final int[][][] _arr3D) {
        for (int i = 0; i < MAX_SIZE; ++i) {
            for (int j = 0; j < MAX_SIZE; ++j) {
                _arr3D[i][j][0] = i;
                _arr3D[i][j][1] = j;
                _arr3D[i][j][2] = _arr3D[i][j][0] * _arr3D[i][j][1];
            }
        }
    }

    private static void print3DArrayToMultiplicationTable(final int[][][] _arr3D) {
        for (int i = 2; i < MAX_SIZE; ++i) { // 2단부터~
            System.out.format("-----%d단-----\n", i);
            for (int j = 1; j < MAX_SIZE; ++j) { // 1부터 곱셈~
                System.out.format("%2d x %2d = %2d\n", _arr3D[i][j][0], _arr3D[i][j][1], _arr3D[i][j][2]);
            }
        }
    }

    public static void main(String[] args) {
        // [단] x [수] = {단 ,수 ,결과 };
        final int[][][] arr3D = new int[MAX_SIZE][MAX_SIZE][3];

        set3DArrayFromMultiplicationTable(arr3D);
        print3DArrayToMultiplicationTable(arr3D);
    }

}