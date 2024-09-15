package org.example.transposeOfMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Arrays.deepToString(transposeMatrix(matrix)));
    }

    static int[][] transposeMatrix(int[][] matrix) {

        int[][] transposeMatrix = new int[matrix.length][matrix.length];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }
}
