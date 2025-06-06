package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            PrintWriter printWriter = new PrintWriter(new FileWriter((reader.readLine())))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] splittedLine = line.split(" ");
                for (String numberInString : splittedLine) {
                    double number = Double.parseDouble(numberInString);
                    long roundedNumber = Math.round(number);
                    printWriter.print(roundedNumber + " ");
                }
            }
        }
    }
}
