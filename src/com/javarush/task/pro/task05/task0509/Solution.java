package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int y = 0; y < MULTIPLICATION_TABLE.length; y++) {

            for (int x = 0; x < MULTIPLICATION_TABLE[y].length; x++) {
                MULTIPLICATION_TABLE[y][x] = (y+1) * (x+1);
            }
        }

        for (int y = 0; y < MULTIPLICATION_TABLE.length; y++) {

            for (int x = 0; x < MULTIPLICATION_TABLE[y].length; x++) {

                System.out.print(MULTIPLICATION_TABLE[y][x] + " ");
            }
            System.out.println();
        }
    }
}
