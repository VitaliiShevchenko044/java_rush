package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        try (BufferedWriter fileWriter1 = new BufferedWriter(new FileWriter(fileName1, true));
             BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2));
             BufferedReader fileReader3 = new BufferedReader(new FileReader(fileName3))) {

            String line;
            while ((line = fileReader2.readLine()) != null) {
                fileWriter1.write(line);
            }
            while ((line = fileReader3.readLine()) != null) {
                fileWriter1.write(line);
            }
        }
    }
}
