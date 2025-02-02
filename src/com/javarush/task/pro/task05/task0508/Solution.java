package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        String[] strCopy = new String[strings.length];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
            strCopy[i] = strings[i];
        }
        
        for (int i = 0; i < strCopy.length; i++) {
            for (int j = i+1; j < strCopy.length; j++) {

                if (strCopy[i] == null)
                    break;

                if (strCopy[i].equals(strCopy[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (String string : strings) {
            System.out.print(string + ", ");
        }
        scanner.close();
    }
}
