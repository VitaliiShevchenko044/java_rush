package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишите тут ваш код
        URLConnection URLConn = url.openConnection();
        URLConn.setDoOutput(true);

        try (OutputStream output = URLConn.getOutputStream()) {
            PrintStream sender = new PrintStream(output);
            sender.println("Привіт");
        }
        try (InputStream input = URLConn.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input))){
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        }
    }
}

