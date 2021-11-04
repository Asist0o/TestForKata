package com.company;

public class Check {
    private static final String[] Roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private static final String[] Arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static boolean roman(String nume) {
        for (int i = 0; i < Roman.length; i++) {
            if (Roman[i].equals(nume)) return true;
        }
        return false;
    }

    public static boolean arabic(String nume) {
        for (int i = 0; i < Arabic.length; i++) {
            if (Arabic[i].equals(nume)) return true;
        }
        return false;
    }
    public static boolean operation(String nume){
        if(nume.equals("-") || nume.equals("+") || nume.equals("*") || nume.equals("/"))
            return true;
        return false;
    }

}
