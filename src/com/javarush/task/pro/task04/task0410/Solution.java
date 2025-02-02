package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;
        int minValueBigger = Integer.MAX_VALUE;
        int i = 1;
        while (i <= 2 || scanner.hasNextInt()) {
            int currentValue = scanner.nextInt();
            if (currentValue > minValue && currentValue < minValueBigger)
                minValueBigger = currentValue;
            else if (currentValue < minValue) {
                minValueBigger = minValue;
                minValue = currentValue;
            }
            i++;
        }
        System.out.println(minValueBigger);
    }
}