package com.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренировка временных зон
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код
        TreeSet<String> allZones = new TreeSet<>();
        for (String zone : ZoneId.getAvailableZoneIds()) {
            allZones.add(zone);
        }

        return allZones;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
