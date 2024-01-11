package org.example.addTwoSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        StringBuilder firstNumber = new StringBuilder();
        StringBuilder secondNumber = new StringBuilder();
        for (int i = l1.size() - 1; i >= 0; i--) {
            firstNumber.append(l1.get(i));
        }
        for (int i = l2.size() - 1; i >= 0; i--) {
            secondNumber.append(l2.get(i));
        }
        int sum = Integer.parseInt(firstNumber.toString()) + Integer.parseInt(secondNumber.toString());

        char[]sumChar = String.valueOf(sum).toCharArray();
        for (int i = sumChar.length - 1; i >= 0; i--) {
            result.add(Character.getNumericValue(sumChar[i]));
        }

        return result;
    }
}
