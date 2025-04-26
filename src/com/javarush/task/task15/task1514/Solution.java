package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(5.0, "Vasilii");
        labels.put(4.1, "Maria");
        labels.put(2.5, "Petr");
        labels.put(4.4, "Vitalii");
        labels.put(4.5, "Marina");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
