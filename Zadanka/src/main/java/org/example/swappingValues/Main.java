package org.example.swappingValues;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        swappingTwoNumbers(a, b);

    }

    static void swappingTwoNumbers(int a, int b) {
        int temp = 0;

        temp = b;
        b = a;
        a = temp;
        System.out.println("swapped numbers " + a + " " + b);
    }
}
