package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        if (binaryNumber == null || binaryNumber.isEmpty())
            return "";

        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = 0 + binaryNumber;
        }

        String hexNumber = "";
        for (int i = 0; i < binaryNumber.length(); i += 4) {

            int num1 = Character.getNumericValue(binaryNumber.charAt(i));
            int num2 = Character.getNumericValue(binaryNumber.charAt(i+1));
            int num3 = Character.getNumericValue(binaryNumber.charAt(i+2));
            int num4 = Character.getNumericValue(binaryNumber.charAt(i+3));

            String fourBits = "" + num1 + num2 + num3 + num4;

            switch (fourBits) {
                case "0000" -> hexNumber += 0;
                case "0001" -> hexNumber += 1;
                case "0010" -> hexNumber += 2;
                case "0011" -> hexNumber += 3;
                case "0100" -> hexNumber += 4;
                case "0101" -> hexNumber += 5;
                case "0110" -> hexNumber += 6;
                case "0111" -> hexNumber += 7;
                case "1000" -> hexNumber += 8;
                case "1001" -> hexNumber += 9;
                case "1010" -> hexNumber += 'a';
                case "1011" -> hexNumber += 'b';
                case "1100" -> hexNumber += 'c';
                case "1101" -> hexNumber += 'd';
                case "1111" -> hexNumber += 'f';
                default -> {
                    return "";
                }
            }
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        if (hexNumber == null || hexNumber.isEmpty())
            return "";

        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            char ch = hexNumber.charAt(i);
            switch (ch) {
                case  '0' -> binaryNumber += "0000";
                case  '1' -> binaryNumber += "0001";
                case  '2' -> binaryNumber += "0010";
                case  '3' -> binaryNumber += "0011";
                case  '4' -> binaryNumber += "0100";
                case  '5' -> binaryNumber += "0101";
                case  '6' -> binaryNumber += "0110";
                case  '7' -> binaryNumber += "0111";
                case  '8' -> binaryNumber += "1000";
                case  '9' -> binaryNumber += "1001";
                case  'a' -> binaryNumber += "1010";
                case  'b' -> binaryNumber += "1011";
                case  'c' -> binaryNumber += "1100";
                case  'd' -> binaryNumber += "1101";
                case  'f' -> binaryNumber += "1111";
                default -> {
                    return "";
                }
            }
        }
        return binaryNumber;
    }
}
