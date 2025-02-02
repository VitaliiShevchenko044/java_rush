package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameUser = scanner.nextLine();
        int ageUser = scanner.nextInt();
        String militaryCommissar = ", явитесь в военкомат";

        if (ageUser >= 18 && ageUser <= 28)
            System.out.println(nameUser + militaryCommissar);
    }
}
