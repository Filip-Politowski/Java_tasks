package org.example.minimumFallingPathSum;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{100,-42,-46,-41},{31,97,10,-10}, {-58,-51,82,89},{51,81,69,-51}};
        Solution solution = new Solution();

        System.out.println(solution.minFallingPathSum(matrix));
    }
}
