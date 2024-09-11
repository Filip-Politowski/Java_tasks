package org.example.calculateSimpleIntrest;

public class Main {
    public static void main(String[] args) {
        double P, T, R;
        P = 3000.0;
        T = 7.0;
        R = 1.0;
        System.out.println(calculateSimpleInterest(P, T, R));

    }
    static Double calculateSimpleInterest (Double P, Double T, Double R){
        return (P*T*R)/100;
    }
}
