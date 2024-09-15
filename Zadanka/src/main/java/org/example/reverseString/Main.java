package org.example.reverseString;

public class Main {
    public static void main(String[] args) {
        String word = "Geeks";

        System.out.println(reverseString(word));
    }

    private static String reverseString(String word) {
        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord.append(word.charAt(i));
        }
        return reverseWord.toString();
    }
}
