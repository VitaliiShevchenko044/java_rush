package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)){
            for (Path path : files) {
                if (Files.isRegularFile(path)) {
                    Path resolve = targetDirectory.resolve(path.getFileName());
                    //path.getFileName() повертає останню частину шляху, тобто ім'я файлу (або папки), яке міститься в об'єкті path
                    //метод resolve() на об'єкті targetDirectory додає (конкатенує) отримане ім'я файлу до шляху targetDirectory
                    //В результаті формується новий об'єкт типу Path, що представляє шлях до файлу, розташованого в директорії targetDirectory
                    Files.copy(path, resolve);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

