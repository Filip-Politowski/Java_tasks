package org.example.zigzagConversion;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String result = solution.convert(input, numRows);
        System.out.println(result); // Wypisze: "PAHNAPLSIIGYIR"
    }
}
