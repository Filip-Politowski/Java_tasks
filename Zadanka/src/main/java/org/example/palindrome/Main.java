package org.example.palindrome;

public class Main {
    public static void main(String[] args) {
        String word = "atokawaakota";
        System.out.println(checkIfTheWordIsPalindrome(word));
    }

    private static boolean checkIfTheWordIsPalindrome(String word) {

        int index = 0;
        for (int i = word.length() - 1; i > 0; i--) {
            if (word.charAt(i) != word.charAt(index++)) {
                return false;
            }
        }
        return true;
    }
}
