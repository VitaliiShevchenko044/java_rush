package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value < minValue)
                minValue = value;
        }
        System.out.println(minValue);
        scanner.close();
    }
}