package org.example.anagram;

public class Main {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";
        System.out.println(checkIfWordsAreAnagrams(str1, str2));
    }

    private static boolean checkIfWordsAreAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String lowerCaseString1 = str1.toLowerCase();
        String lowerCaseString2 = str2.toLowerCase();

        boolean sameLetter = false;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (lowerCaseString1.charAt(i) == lowerCaseString2.charAt(j)) {
                    sameLetter = true;
                    break;
                }
            }
            if (!sameLetter) {
                return false;
            }
        }
        return true;
    }
}
