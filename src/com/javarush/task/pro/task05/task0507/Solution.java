package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNumber < array[i])
                maxNumber = array[i];
        }
        System.out.println(maxNumber);
        scanner.close();
    }
}
