package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        reader.close();

        int lessNumber = Math.min(num1, num2);
        while (lessNumber > 0) {
            if (num1 % lessNumber == 0 && num2 % lessNumber == 0) {
                System.out.println(lessNumber);
                break;
            }
        lessNumber--;
        }
    }
}
