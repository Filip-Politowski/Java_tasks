package org.example.squarePattern;

public class Main {
    public static void main(String[] args) {
        int number = 20;
        printSquarePattern(number);
    }

    static void printSquarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.print("* ");
                }
                if (i >= 1 && i < n - 1) {
                    System.out.print(j == 0 || j == n - 1 ? "* " : "  ");
                }
                if (i == n - 1) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}
