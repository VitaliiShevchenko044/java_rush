package com.javarush.task.task19.task1908;

import java.io.*;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] lineSeparator = line.trim().split("\\s+");
                for (String str : lineSeparator) {
                    if (getInteger(str) != null) {
                        fileWriter.write(str + " ");
                    }
                }
            }
        }
    }

    public static Integer getInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
