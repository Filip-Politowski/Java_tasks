package org.example.searchInsertPosition;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int index = 0;

        for (int num : nums) {
            list.add(num);
        }

        if (list.contains(target)) {
            return list.indexOf(target);
        } else {
            for (Integer number : list) {
                index++;
                if (number > target) {
                    return index - 1;
                }
            }
        }

        return index;
    }
}
