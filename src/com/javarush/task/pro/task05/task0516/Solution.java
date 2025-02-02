package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int separator = (int) Math.round(array.length/2f);
        Arrays.fill(array, 0, separator, valueStart);
        Arrays.fill(array, separator, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
