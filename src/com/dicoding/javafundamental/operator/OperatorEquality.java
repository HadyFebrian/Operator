package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int value = 5;
        int anotherValue = 4;
        boolean result;

        System.out.println("Value = 5" );
        System.out.println("anotherValue = 4");
        System.out.println();

        System.out.println("Equal to");
        result = value == anotherValue;
        System.out.println("Hasil 'Value == anotherValue' Adalah "+ result);
        System.out.println();

        System.out.println("Not Equal To");
        result = value != anotherValue;
        System.out.println("Hasil 'Value != anotherValue' Adalah "+ result);
        System.out.println();

        System.out.println("Greater Than");
        result = value > anotherValue;
        System.out.println("Hasil 'Value > anotherValue' Adalah "+ result);
        System.out.println();

        System.out.println("Greater Than or Equal To");
        result = value >= anotherValue;
        System.out.println("Hasil 'Value >= anotherValue' Adalah "+ result);
        System.out.println();

        System.out.println("Less Than");
        result = value < anotherValue;
        System.out.println("Hasil 'Value < anotherValue' Adalah "+ result);
        System.out.println();

        System.out.println("Less Than Equal To");
        result = value <= anotherValue;
        System.out.println("Hasil 'Value <= anotherValue Adalah " + result);
        System.out.println();
    }
}
