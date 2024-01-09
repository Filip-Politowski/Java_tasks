package org.example.mergeTwoSortedLists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3);
        List<Integer> list2 = List.of(1,4,5,6);
        List<Integer> list3;

        Solution solution = new Solution();

        list3 = solution.mergeTwoLists(list1, list2);
        System.out.println(list3);
    }
}
