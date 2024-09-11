package org.example.integerToBinary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 17;
        swappingNumberToBinary(number);
    }

    private static void swappingNumberToBinary(int n) {
        int[] binaryArray = {0,0,0,0,0,0,0,0};
        int i = 0;
        while(n > 0){
            binaryArray[i] = n % 2;
            n = n/2;
            System.out.println(n);
            i++;
        }
        for(int j =binaryArray.length - 1; j >= 0; j--){
            System.out.println(binaryArray[j]);
        }
    }
}
