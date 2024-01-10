package org.example.removeDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) return  0;
        if(nums.length == 1) return  1;


        List<Integer> list = new ArrayList<>();
        int uniqueElements = 0;

        for (int num : nums) {
            if(!list.contains(num)){
                list.add(num);
                uniqueElements++;
            }
        }
        System.out.println(list);

        return uniqueElements;
    }
}
