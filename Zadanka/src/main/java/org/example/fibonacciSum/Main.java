package org.example.fibonacciSum;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibEvenSum(3));
    }

    static int fibEvenSum(int N) {

        if (N <= 0) {
            return 0;
        }
        int[] fib = new int[2 * N + 1];
        fib[0] = 0;
        fib[1] = 1;
        int sum = 0;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (i % 2 == 0) {

                sum = sum + fib[i];
            }
        }

        return sum;

    }
}
