package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bonjour le monde");
        System.out.println("*************************************");
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.addition(2,1);
        System.out.println(result);
        System.out.println("*************************************");

        SimpleCalculator multi = new SimpleCalculator();
        int resul = multi.multiplication(4,4);
        System.out.println(resul);
        System.out.println("*************************************");

        boolean test;
        test = calculator.isEven(5);
        System.out.println(test);


    }
}