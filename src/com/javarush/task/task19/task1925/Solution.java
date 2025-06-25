package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            boolean isFirst = true;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String word : parts) {
                    if (word.length() > 6) {
                        if (!isFirst) {
                            writer.write(",");
                        }
                        writer.write(word);
                        isFirst = false;
                    }
                }
            }
        }
    }
}
