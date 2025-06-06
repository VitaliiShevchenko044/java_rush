package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        StringBuilder builder = new StringBuilder();

        try (BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1))) {
            String line;
            while ((line = fileReader1.readLine()) != null) {
                builder.append(line);
            }
        }

        try (BufferedWriter fileWriter1 = new BufferedWriter(new FileWriter(fileName1));
            BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2))) {
            String line;
            while ((line = fileReader2.readLine()) != null) {
                fileWriter1.write(line);
            }
            fileWriter1.write(builder.toString());
        }
    }
}
