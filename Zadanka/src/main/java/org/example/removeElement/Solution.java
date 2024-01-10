package org.example.removeElement;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int removeElement(int[] nums, int val) {

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                list.add(num);
            }
        }
        int i = 0;
        for(int num : list){
            nums[i++] = num;
        }

        return list.size();
    }
}
