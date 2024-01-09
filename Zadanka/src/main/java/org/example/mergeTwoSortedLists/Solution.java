package org.example.mergeTwoSortedLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {

        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
//        result.sort(Integer::compareTo);
        result.sort((o1, o2) -> o1 - o2);
        return result;
    }
}
