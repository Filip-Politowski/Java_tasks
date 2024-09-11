package org.example.addTwoComplexNumbers;

public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(2, 3);
        ComplexNumber complexNumber2 = new ComplexNumber(3, 4);
        System.out.println("Sum of complex number " + complexNumber1 + " plus complex number  " + complexNumber2 + " equals " + sumOfTwoComplexNumbers(complexNumber1, complexNumber2));
    }

    static ComplexNumber sumOfTwoComplexNumbers(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
        ComplexNumber complexNumber = new ComplexNumber();
        complexNumber.real = firstComplexNumber.real + secondComplexNumber.real;
        complexNumber.image = firstComplexNumber.image + secondComplexNumber.image;

        return complexNumber;
    }
}
