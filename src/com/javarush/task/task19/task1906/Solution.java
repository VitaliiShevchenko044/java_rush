package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
             FileWriter fileWriter = new FileWriter(reader.readLine())) {

            int temp;
            int count = 1;
            while ((temp = fileReader.read()) != -1) {
                if (count % 2 == 0) {
                    fileWriter.write(temp);
                }
                count++;
            }
        }
    }
}
