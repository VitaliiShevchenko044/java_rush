package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            int[] byteCounts = new int[256];
            int temp;
            while ((temp = fileInputStream.read()) != -1) {
                byteCounts[temp]++;
            }

            int maxCount = 0;
            //int valueByte = 0;
            for (int i = 0; i < byteCounts.length; i++) {
                if (byteCounts[i] > maxCount) {
                    maxCount = byteCounts[i];
                    //valueByte = i;
                }
            }

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < byteCounts.length; i++) {
                if (byteCounts[i] == maxCount)
                    list.add(i);
            }

            for (Integer item : list) {
                System.out.print(item + " ");
            }
        }
    }
}
