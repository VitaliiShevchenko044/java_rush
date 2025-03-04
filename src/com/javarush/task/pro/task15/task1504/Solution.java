package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (var scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            byte[] bytes = inputStream.readAllBytes();

            for (int i = 0; i < bytes.length; i += 2) {
                if (i < bytes.length - 1) {
                    byte currentIndex = bytes[i];
                    bytes[i] = bytes[i + 1];
                    bytes[i + 1] = currentIndex;
                }
            }
            outputStream.write(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
