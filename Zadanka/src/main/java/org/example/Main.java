package org.example;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 3, 1, 5};
        System.out.println(Arrays.toString(removeDuplicateFromArray(array)));
    }

    private static int[] removeDuplicateFromArray(int[] array) {
//        Set<Integer> setList = new HashSet<>();
//        for (int i : array) {
//            setList.add(i);
//        }
//        int[] arrayWithoutDuplicate = new int[setList.size()];
//        int index = 0;
//        for (Integer i : setList) {
//            arrayWithoutDuplicate[index] = i;
//            index++;
//        }
//        return arrayWithoutDuplicate;
        int index = 0;
        int[] temporaryArray = new int[array.length];
        for (int k : array) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (k == temporaryArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temporaryArray[index++] = k;
            }
        }
        int[] arrayWithoutDuplicate = new int[index];
        System.arraycopy(temporaryArray, 0, arrayWithoutDuplicate, 0, arrayWithoutDuplicate.length);
        return arrayWithoutDuplicate;
    }
}
