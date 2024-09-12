package org.example.sumOfNumbersInArray;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 9};
        System.out.println(computeTheSumOfArrayElements(array));
    }

    static int computeTheSumOfArrayElements(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }
}
