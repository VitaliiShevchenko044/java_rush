package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

import java.util.Arrays;

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int z = 0; z < multiArray.length; z++) {
            for (int y = 0; y < multiArray[z].length; y++) {
                for (int x = 0; x < multiArray[z][y].length; x++) {
                    System.out.print(multiArray[z][y][x] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
