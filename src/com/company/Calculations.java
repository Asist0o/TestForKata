package com.company;

public class Calculations {
    public static int calculations(int numberFirst, int numberSecond, String operator) throws MyException {
        int total;
        switch (operator) {
            case "-":
                total = numberFirst - numberSecond;
                return total;
            case "+":
                total = numberFirst + numberSecond;
                return total;
            case "*":
                total = numberFirst * numberSecond;
                return total;
            case "/":
                total = numberFirst / numberSecond;
                return total;
        }
        throw new MyException("Что то пошло не так...");
    }
}
