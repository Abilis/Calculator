package ru.java.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 * Created by Abilis on 12.05.2016.
 */
public class CalcInit {

    private static double first = 0.0;
    private static double second = 0.0;


    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String temp = null;

        while (true) {

            try {

                System.out.println("Введите первое число (\"exit\" для выхода):");
                temp = reader.readLine();

                if (temp.equalsIgnoreCase("exit")) {
                    break;
                }

                first = Double.parseDouble(temp);

                System.out.println("Введите второе число (\"exit\" для выхода):");
                temp = reader.readLine();

                if (temp.equalsIgnoreCase("exit")) {
                    break;
                }

                second = Double.parseDouble(temp);

                System.out.println("Введите операцию (+, -, *, /) (\"exit\" для выхода):");
                temp = reader.readLine();

                if (temp.equalsIgnoreCase("exit")) {
                    break;
                }

                switch (temp) {
                    case "+":
                        Calculator.add(first, second);
                        break;
                    case "-":
                        Calculator.substruct(first, second);
                        break;
                    case "*":
                        Calculator.multiple(first, second);
                        break;
                    case "/":
                        Calculator.div(first, second);
                        break;
                    default:
                        System.out.println("Операция не распознана. Попробуйте еще раз");
                        continue;
                }

                System.out.println(first + " " + temp + " " + second + " = " + Calculator.getResult());


            } catch (IOException e1) {
                System.out.println("Введенны некорректные данные. Попробуйте еще раз");
            } catch (NumberFormatException e2) {
                System.out.println("Введенные данные не являются числом");
            }


        }

        System.out.println("Хорошего дня!");

    }

}
