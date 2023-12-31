package org.example.equalsString;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
                System.out.println(charCount);
            }
        }

        for (int count : charCount.values()) {
            if (count % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}
