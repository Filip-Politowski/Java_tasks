package org.example.arrayRotation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        System.out.println(Arrays.toString(arrayRotation(array, d)));
    }

    private static int[] arrayRotation(int[] array, int d) {
        int[] tempArray = new int[array.length];
        int j = 0;
        for (int i = d; i < array.length; i++) {
            tempArray[j] = array[i];
            j++;
            if (i == array.length - 1) {
                for (int k = 0; k < d; k++) {
                    tempArray[j] = array[k];
                    j++;
                }
            }
        }
        return tempArray;
    }
}
