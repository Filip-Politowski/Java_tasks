package org.example.linearSerch;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 3, 8, 9};
        int x = 6;
        numberExistInArray(array, x);
    }

    private static void numberExistInArray(int[] array, int x) {
        boolean exist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("number exist in array on index " + i);
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("number not exist in array");
        }
    }


}
