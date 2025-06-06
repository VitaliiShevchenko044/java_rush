package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] aSCII = new int[128];

        try (FileReader reader = new FileReader(args[0])) {
            int temp;
            while ((temp = reader.read()) != -1) {
                aSCII[temp]++;
            }
        }
        for (int i = 0; i < 128; i++) {
            if (aSCII[i] != 0) {
                System.out.println((char) i + " " + aSCII[i]);
            }
        }


//        String fileName = args[0];
//        TreeMap<Character, Integer> treeMap = new TreeMap<>();
//
//        for (int i = 0; i < 128; i++) {
//            treeMap.put((char) i, 0);
//        }
//
//        try (FileReader fileReader = new FileReader(fileName)) {
//            int temp;
//            while ((temp = fileReader.read()) != -1) {
//                Character tempChar = (char) temp;
//                int counter = treeMap.get(tempChar);
//                treeMap.replace(tempChar, ++counter);
//            }
//        }
//
//        treeMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
