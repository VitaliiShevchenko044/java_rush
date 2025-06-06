package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            int minByte = fileInputStream.read();
            int temp;
            while ((temp = fileInputStream.read()) != -1) {
                if (temp < minByte) {
                    minByte = temp;
                }
            }
            System.out.println(minByte);
        }
    }
}
