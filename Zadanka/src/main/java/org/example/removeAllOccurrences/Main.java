package org.example.removeAllOccurrences;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 1};
        int occurrenceNumber = 1;
        System.out.println(Arrays.toString(removeOccurrence(array, occurrenceNumber)));
    }

    private static int[] removeOccurrence(int[] array, int number) {
        int[] tempArray = new int[array.length];
        int index = 0;
        for (int j : array) {
            if (j == number) {
                continue;
            }
            tempArray[index++] = j;
        }
        int[] arrayWithoutOccurrences = new int[index];
        System.arraycopy(tempArray, 0, arrayWithoutOccurrences, 0, arrayWithoutOccurrences.length);
        return arrayWithoutOccurrences;
    }
}
