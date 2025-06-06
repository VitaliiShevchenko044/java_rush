package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int commaCount = 0;
//        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
//            int byteRead;
//            while ((byteRead = fileInputStream.read()) != -1) {
//                if (byteRead == 44) {
//                    commaCount++;
//                }
//            }
//        }
        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())){
            while(fileInputStream.available() > 0) {
                if (fileInputStream.read() == 44) commaCount++;
            }
        }
        System.out.println(commaCount);
    }
}
