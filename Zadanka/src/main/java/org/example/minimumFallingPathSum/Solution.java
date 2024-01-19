package org.example.minimumFallingPathSum;

import java.util.*;

public class Solution {
        public int minFallingPathSum(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            // Iteracja po wierszach od przedostatniego wiersza do pierwszego
            for (int i = rows - 2; i >= 0; i--) {
                for (int j = 0; j < cols; j++) {
                    // Obliczanie najmniejszej sumy dla bieżącej komórki
                    int minSum = matrix[i][j] + Math.min(
                            matrix[i + 1][j],
                            Math.min(
                                    (j > 0) ? matrix[i + 1][j - 1] : Integer.MAX_VALUE,
                                    (j < cols - 1) ? matrix[i + 1][j + 1] : Integer.MAX_VALUE
                            )
                    );

                    // Aktualizacja wartości w macierzy wejściowej
                    matrix[i][j] = minSum;
                }
            }

            // Znalezienie najmniejszej sumy w pierwszym wierszu
            int minPathSum = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                minPathSum = Math.min(minPathSum, matrix[0][j]);
            }

            return minPathSum;
        }
    }