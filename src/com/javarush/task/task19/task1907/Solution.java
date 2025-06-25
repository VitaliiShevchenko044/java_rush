package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        StringBuilder builder = new StringBuilder();
//        List<Character> punctuationMarks = new ArrayList<>(List.of('.', ',', ';', ':', '!', '?', '-', '(', ')', '"'));
//        int wordCount = 0;
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//             FileReader fileReader = new FileReader(reader.readLine())) {
//
//            int temp;
//            while ((temp = fileReader.read()) != -1) {
//                char ch = (char) temp;
//                if (punctuationMarks.contains(ch)) {
//                    if (builder.toString().equals("world")) {
//                        wordCount++;
//                    }
//                    builder.setLength(0);
//                } else {
//                    builder.append(ch);
//                }
//            }
//            if (builder.toString().equals("world")) {
//                wordCount++;
//            }
//        }
//        System.out.println(wordCount);

        int counter = 0;
        String fileName;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        }

        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            char currentChar;
            while (reader.ready()) {
                currentChar = (char) reader.read();
                text.append(currentChar);

            }
        }

        String replacedString = text.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        for (String x : replacedString.split(" ")) {
            if (x.equals("world")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
