package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    public static Month[] getWinterMonths() {
        Month[] winterMonths = new Month[3];
        winterMonths[0] = Month.values()[11];
        winterMonths[1] = Month.values()[0];
        winterMonths[2] = Month.values()[1];
        return winterMonths;
    }

    public static Month[] getSpringMonths() {
        Month[] springMonths = new Month[3];
        springMonths[0] = Month.values()[2];
        springMonths[1] = Month.values()[3];
        springMonths[2] = Month.values()[4];
        return springMonths;
    }

    public static Month[] getSummerMonths() {
        Month[] summerMonths = new Month[3];
        summerMonths[0] = Month.values()[5];
        summerMonths[1] = Month.values()[6];
        summerMonths[2] = Month.values()[7];
        return summerMonths;
    }

    public static Month[] getAutumnMonths() {
        Month[] autumnMonths = new Month[3];
        autumnMonths[0] = Month.values()[8];
        autumnMonths[1] = Month.values()[9];
        autumnMonths[2] = Month.values()[10];
        return autumnMonths;
    }
}
