package org.example.addTwoComplexNumbers;

public class ComplexNumber {
    int real;
    int image;

    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public ComplexNumber() {

    }

    @Override
    public String toString() {
        return
                real +
                " + " + image + "i";

    }
}
