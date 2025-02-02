package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i+1];
        }


        for (int y = 0; y < result.length; y++) {
            for (int x = 0; x < result[y].length; x++) {
                result[y][x] = y + x;
            }
        }

        for (int y = 0; y < result.length; y++) {
            for (int x = 0; x < result[y].length; x++) {
                System.out.print(result[y][x] + " ");
            }
            System.out.println();
        }
    }
}
