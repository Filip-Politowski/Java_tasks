package org.example.findFactorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 5;

        findFactorial(number);

    }

    private static void findFactorial(int n) {
        int[] array = new int[n];
        int sum = 1;
        for (int i = 0; i < array.length ; i++) {
            array[i] = n - i ;
            sum = sum * array[i];
        }

        System.out.println(sum);
    }
}
