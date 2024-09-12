package org.example.piramidPatternOneInTheMiddle;

public class Main {
    public static void main(String[] args) {
        int number = 9 ;
        printPiramidPattern(number);
    }

    static void printPiramidPattern(int n) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            a = i + 1;
            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a - j + " ");
                b = a - j;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(b + j + 1 + " ");
            }
            System.out.println();
        }
    }
}
