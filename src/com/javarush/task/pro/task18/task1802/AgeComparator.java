package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator <Student> {
    //напишите тут ваш код
    @Override
    public int compare(Student st1, Student st2) {
        return st2.getAge() - st1.getAge();
    }
}
