package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            allLines = Files.readAllLines(Path.of(reader.readLine()));
//            forRemoveLines = Files.readAllLines(Path.of(reader.readLine()));
//            new Solution().joinData();
//        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = null;
        String fileName2 = null;
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();
            BufferedReader fReader1 = new BufferedReader(new FileReader(fileName1));
            String line;
            while ((line = fReader1.readLine()) != null)
                allLines.add(line);
            fReader1.close();
            BufferedReader fReader2 = new BufferedReader(new FileReader(fileName2));
            while ((line = fReader2.readLine()) != null)
                forRemoveLines.add(line);
            fReader2.close();
            new Solution().joinData();
        } catch (IOException e) {
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
