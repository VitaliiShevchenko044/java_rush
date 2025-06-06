package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        switch (args[0]) {
            case "-e":
                try (FileInputStream fileInputStream = new FileInputStream(args[1]);
                     FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
                    int byteRead;
                    while ((byteRead = fileInputStream.read()) != -1) {
                        fileOutputStream.write(byteRead + 21);
                    }

                } catch (IOException ignore) {}
                break;
            case "-d":
                try (FileInputStream fileInputStream = new FileInputStream(args[1]);
                     FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
                    int byteRead;
                    while ((byteRead = fileInputStream.read()) != -1) {
                        fileOutputStream.write(byteRead - 21);
                    }

                } catch (IOException ignore) {}
                break;
        }
    }
}
