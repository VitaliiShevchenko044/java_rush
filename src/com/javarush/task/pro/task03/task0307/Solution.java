package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
        
        if (userAge < 20 || userAge > 60) 
            System.out.println("можно не работать");

        scanner.close();
    }
}
