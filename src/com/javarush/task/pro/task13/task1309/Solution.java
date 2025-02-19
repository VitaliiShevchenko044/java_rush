package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Vitalii Shevchenko", 90.1);
        grades.put("Marina Shevchenko", 86.5);
        grades.put("Vasilii Arkanov", 60.5);
        grades.put("Andrew Kolico", 83.5);
        grades.put("Entony Crew", 96.5);
    }
}
