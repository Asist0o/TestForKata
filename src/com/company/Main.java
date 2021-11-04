package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, "
                + "умножения и деления с двумя числами: a + b, a - b, a * b, a / b. \n>>>");
                Scanner sc = new Scanner(System.in);
                String[] array = new String[3];

                String lineApp = sc.nextLine();
                array = lineApp.split(" ");
                String numeFirst = array[0];
                String numeSecond = array[2];
                String operator = array[1];


                if (Check.roman(numeFirst) && Check.roman(numeSecond) && Check.operation(operator)) {
                    int arabicResult;
                    String romanResult;
                    arabicResult = Calculations.calculations(Convert.romanToArabic(numeFirst), Convert.romanToArabic(numeSecond), operator);
                    romanResult = Convert.arabicToRoman(arabicResult);
                    System.out.println(romanResult);
                    break;
                } else if (Check.arabic(numeFirst) && Check.arabic(numeSecond) && Check.operation(operator)) {
                    int arabicResult, returnFirst, returnSecond;
                    returnFirst = Integer.parseInt(numeFirst);
                    returnSecond = Integer.parseInt(numeSecond);
                    arabicResult = Calculations.calculations(returnFirst, returnSecond, operator);
                    System.out.println(arabicResult);
                    break;
                } else throw new MyException("Вы считаете не по правилам!");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Ошибка ввода. Введите выражение типа (1 + 2) or ( I * II)");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Пожалуйста, введите выражение типа (1 + 2) or ( I * II)!");
            }
        }

    }
}
