package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream originalStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String[] strings = byteArrayOutputStream.toString().split(" ");
        System.setOut(originalStream);
        int num1 = Integer.parseInt(strings[0]);
        int num2 = Integer.parseInt(strings[2]);
        int result;

        if (strings[1].equals("-"))
            result = num1 - num2;
        else if (strings[1].equals("+"))
            result = num1 + num2;
        else
            result = num1 * num2;

        for (String str : strings) {
            System.out.print(str + " ");
            if (str.equals("=")) {
                System.out.println(result);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

