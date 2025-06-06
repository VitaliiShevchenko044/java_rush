package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] byteCounts = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {

            int temp;
            while ((temp = fileInputStream.read()) != -1) {
                byteCounts[temp]++;
            }
        }

        int minCount = Integer.MAX_VALUE;
        for (int byteCount : byteCounts) {
            if (byteCount > 0 && byteCount < minCount)
                minCount = byteCount;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < byteCounts.length; i++) {
            if (byteCounts[i] == minCount) list.add(i);
        }

        for (Integer item : list) {
            System.out.print(item + " ");
        }
    }
}
