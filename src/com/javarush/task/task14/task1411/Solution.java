package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        //тут цикл по чтению ключей, пункт 1
        loop:
        while (true) {
            //создаем объект, пункт 2
            key = reader.readLine();
            switch (key) {
                case "user":
                    doWork(new Person.User());  //вызываем doWork
                    break;
                case "loser":
                    doWork(new Person.Loser());
                    break;
                case "coder":
                    doWork(new Person.Coder());
                    break;
                case "proger":
                    doWork(new Person.Proger());
                    break;
                default: break loop;
            }
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
