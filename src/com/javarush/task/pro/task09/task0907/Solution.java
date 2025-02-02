package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber <= 0) return "";
        
        String hexNumber = "";
        while (decimalNumber != 0) {
            char ch = HEX.charAt(decimalNumber % 16);
            hexNumber = ch + hexNumber;
            decimalNumber /= 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        if (hexNumber == null || hexNumber.isEmpty()) return 0;
        
        int decimalNumber = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char charHex = hexNumber.charAt(i);
            int value = 0;
            for (int j = 0; j < HEX.length(); j++) {
                if (charHex == HEX.charAt(j)) {
                    value = j;
                    break;
                }
            }
            decimalNumber = 16 * decimalNumber + value;
        }
        return decimalNumber;
    }
}
