package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int separator = array.length % 2 == 0 ? array.length/2 : array.length/2+1;
        int[] firstHalfArray = Arrays.copyOfRange(array, 0, separator);
        int[] secondHalfArray = Arrays.copyOfRange(array, separator, array.length);
        result[0] = firstHalfArray;
        result[1] = secondHalfArray;

        System.out.println(Arrays.deepToString(result));
    }
}
