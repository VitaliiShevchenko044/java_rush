package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int amountOfBottle = scanner.nextInt();
        int amountOfPeople = scanner.nextInt();

        System.out.println(amountOfBottle*1.0/amountOfPeople);
        scanner.close();
    }
}