package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input = scanner.nextBoolean();
        double glass = 0.5;
        if (!input)
            System.out.println((int) Math.floor(glass));
        else
            System.out.println((int) Math.ceil(glass));
    }
}