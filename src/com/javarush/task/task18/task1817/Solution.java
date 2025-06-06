package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader(args[0])) {
            int totalCharCount = 0;
            int spaceCount = 0;
            int temp;
            while ((temp = fileReader.read()) != -1) {
                totalCharCount++;
                if (temp == 32) spaceCount++;
            }

            double spaceRatio = (double) spaceCount / totalCharCount * 100;
            System.out.printf("%.2f", spaceRatio);
        }
    }
}
