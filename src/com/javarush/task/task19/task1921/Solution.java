package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            StringBuilder builder = new StringBuilder();
            int year = Integer.parseInt(parts[parts.length-1]);
            int month = Integer.parseInt(parts[parts.length-2]) - 1;
            int day = Integer.parseInt(parts[parts.length-3]);
            Calendar birthday = new GregorianCalendar(year, month, day);

            for (int i = 0; i < parts.length-3; i++) {
                builder.append(parts[i]).append(" ");
            }

            PEOPLE.add(new Person(builder.toString().trim(), birthday.getTime()));
        }
        reader.close();
    }
}
