package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> treeSet = new TreeSet<>();
        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            int temp;
            while ((temp = fileInputStream.read()) != -1) {
                treeSet.add(temp);
            }
        }
        for (Integer tempByte : treeSet) {
            System.out.print(tempByte + " ");
        }
    }
}
