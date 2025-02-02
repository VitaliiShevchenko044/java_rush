package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

   public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minNumber > array[i])
                minNumber = array[i];
        }
        System.out.println(minNumber);
    }
}
