package org.example.largestElementInArray;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 2, 5, 1, 4, 10, 10};
        System.out.println(findLargestElementInArray(array));
    }

    static int findLargestElementInArray(int[] array) {
        int max = 0;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }
}
