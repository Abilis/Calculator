package ru.java.calculator;

/**
 * Created by Abilis on 12.05.2016.
 */
public class Calculator {

    private static double result;

    public static double getResult() {
        return result;
    }

    public static void add(double first, double second) {
        result = first + second;

    }

    public static void substruct(double first, double second) {
        result = first - second;
    }

    public static void div(double first, double second) {
        result = first / second;
    }

    public static void multiple(double first, double second) {
        result = first * second;
    }

}
