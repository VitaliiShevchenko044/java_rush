package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишите тут ваш код
        //Створюємо об'єкт типу URL,що представлятиме адресу ресурсу.
        URL url = new URL(line);
        //Метод openStream() відкриває потік даних з ресурсу, який вказаний у URL.
        //Отриманий InputStream дозволяє читати байти безпосередньо з цього джерела.
        InputStream input = url.openStream();

        //Метод Files.createTempFile(null, null) створює новий тимчасовий файл у стандартній директорії для тимчасових файлів.
        //Параметри null означають, що система сама згенерує ім'я файлу та використає стандартне розширення.
        Path tempFile = Files.createTempFile(null, null);
        //Метод input.readAllBytes() читає всі байти з потоку.
        //Метод Files.write(tempFile, ...) записує ці байти у створений тимчасовий файл.
        Files.write(tempFile, input.readAllBytes());
    }
}