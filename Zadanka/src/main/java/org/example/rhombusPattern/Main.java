package org.example.rhombusPattern;

public class Main {
    public static void main(String[] args) {
        int number = 15 ;
        printRhombusPattern(number);
    }

    static void printRhombusPattern(int n) {
        int number = 1;
        int b = 1;
        for (int i = 0; i < (n - 1) / 2 + 1; i++) {
            for (int j = 0; j < (n - 1) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < b; k++) {
                System.out.print("*");

            }
            if (b <= n) {
                b = b + 2;
            }
            System.out.println();
        }
        int c = n - 2;
        for (int i = (n - 1) / 2; i > 0; i--) {
            for (int j = 0; j <= (n - 1) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < c; k++) {
                System.out.print("*");
            }
            c = c - 2;
            System.out.println();
        }
    }
}
