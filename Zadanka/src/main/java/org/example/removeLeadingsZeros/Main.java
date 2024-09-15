package org.example.removeLeadingsZeros;

public class Main {
    public static void main(String[] args) {
        String number = "001235069";

        System.out.println(removeLeadingZeros(number));

    }

    private static String removeLeadingZeros(String number) {
        StringBuilder tempNumber = new StringBuilder();
        boolean onlyZeros = true;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0' && onlyZeros) {
                continue;
            }
            tempNumber.append(number.charAt(i));
            if (number.charAt(i) != '0') {
                onlyZeros = false;
            }
        }
        return tempNumber.toString();
    }
}
