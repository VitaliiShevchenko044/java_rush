package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String firstFileName = args[0];
        String secondFileName = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(firstFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(secondFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    String word = parts[i];
                    for (int j = 0; j < word.length(); j++) {
                        try {
                            int num = Integer.parseInt(String.valueOf(word.charAt(j)));
                            writer.write(word + " ");
                            break;
                        } catch (NumberFormatException ignore) {
                        }
                    }
                }
            }
        }
    }
}
