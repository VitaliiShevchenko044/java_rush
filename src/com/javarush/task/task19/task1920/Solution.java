package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> treeMap = new TreeMap<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            if (treeMap.containsKey(parts[0])) {
                treeMap.put(parts[0], treeMap.get(parts[0]) + Double.parseDouble(parts[1]));
            } else {
                treeMap.put(parts[0], Double.parseDouble(parts[1]));
            }
        }

        double maxValue = 0;
        for (Double value : treeMap.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.println(entry.getKey());
            }
        }

        reader.close();
    }
}
