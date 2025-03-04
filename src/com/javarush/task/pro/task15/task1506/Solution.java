package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));

            for (String  line : lines) {
                char[] chars = line.toCharArray();
                for (int i = 0; i < line.length(); i++) {
                    if (chars[i] == '.' || chars[i] == ',' || chars[i] == ' ') {
                        // пропускаю поточну ітерацію
                    } else {
                        System.out.print(chars[i]);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}