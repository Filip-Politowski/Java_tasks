package org.example.largestSubstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int solutionNotFound = -1;

        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            if (charCount.get(ch) == 2) {
                list.add(s.lastIndexOf(ch) - s.indexOf(ch) - 1);
            }
            System.out.println(charCount);
        }
        System.out.println(list);
        if (!list.isEmpty()) {
            return list.stream().max(Integer::compareTo).get();
        } else {
            return solutionNotFound;
        }

    }
}
