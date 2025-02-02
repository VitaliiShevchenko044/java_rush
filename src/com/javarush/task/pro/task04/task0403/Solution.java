package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean running = true;
        String stop = "stop";
        while (running) {

            if (scanner.hasNextInt())
                sum += scanner.nextInt();
            else if (scanner.hasNextLine()) {
                if (stop.equalsIgnoreCase(scanner.nextLine()));
                running = false;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}