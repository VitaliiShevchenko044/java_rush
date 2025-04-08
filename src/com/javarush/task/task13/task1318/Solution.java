package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String destinationFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(destinationFileName);
        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }
        System.out.println(builder);
        reader.close();
        scanner.close();
    }
}