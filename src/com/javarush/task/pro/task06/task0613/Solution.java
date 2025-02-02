package com.javarush.task.pro.task06.task0613;

/* 
Города-гиганты
*/

public class Solution {
    public static String city = "Токио";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printTokyo();
        printCityPopulation("Сеул", 25.2);
        printTokyo();
        printCityPopulation("Дели", 23.1);
        printTokyo();
        printCityPopulation("Нью-Йорк", 21.6);
        printTokyo();
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("Население города " + city + " составляет " + population + " млн человек.");
    }

    public static void printTokyo() {
        System.out.println("В то время как в самом густонаселенном городе " + city + " население составляет " + population + " млн человек.");
    }
}
