package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader(args[0])) {
            int temp;
            int count = 0;
            while ((temp = fileReader.read()) != -1) {
                if (temp < 65 || temp > 90 && temp < 97 || temp > 122);
                else count++;
            }
            System.out.println(count);
        }
    }
}
