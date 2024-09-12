package org.example.pyramidNyumberPattern;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        printingPiramidNumberPattern(number);

    }

    static void printingPiramidNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");

            }
            int number = 0;
            for (int k = 0; k < i; k++) {
                System.out.print(i + k);
                System.out.print(" ");
                number = k + i;
            }
            for (int j = 1; j < i; j++) {
                System.out.print(number - j);
                System.out.print(" ");
            }


            System.out.println();
        }
    }
}
