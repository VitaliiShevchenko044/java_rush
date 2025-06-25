package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(fileNameReader.readLine()))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(builder.append(line).reverse());
                builder.setLength(0);
            }
        }
    }
}
