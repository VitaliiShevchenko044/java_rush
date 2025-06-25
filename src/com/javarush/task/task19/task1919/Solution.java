package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> treeMap = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            if (treeMap.containsKey(parts[0])) {
                treeMap.put(parts[0], treeMap.get(parts[0]) + Double.parseDouble(parts[1]));
            } else {
                treeMap.put(parts[0], Double.parseDouble(parts[1]));
            }
        }

        for (String key : treeMap.keySet()) {
            System.out.println(key + " " + treeMap.get(key));
        }
        reader.close();
    }
}
