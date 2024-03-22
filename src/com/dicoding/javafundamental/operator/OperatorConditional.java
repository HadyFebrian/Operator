package com.dicoding.javafundamental.operator;

public class OperatorConditional {
    public static void main(String[] args) {
        int value = 4;
        int anotherValue = 5;

        System.out.println("Value = 4");
        System.out.println("anotherValue = 5");
        System.out.println();

        System.out.println("Conditinal AND");
        Boolean result = value == 4 && anotherValue == 5;
        Boolean anotherResult = value != 4 && anotherValue == 5;

        System.out.println("Hasil Operator AND pada syarat value == 4 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 4 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();

        System.out.println("Conditional OR");
        result = value == 4 || anotherValue == 5;
        anotherResult = value != 4 || anotherValue == 5;

        System.out.println("Hasil Operator OR pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
    }
}