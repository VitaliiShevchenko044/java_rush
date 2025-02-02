package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String text = " любит меня.";
        int i = 1;
        while (i <= 10) {
            System.out.println(name + text);
            i++;
        }
    }
}
