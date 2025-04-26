package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

import java.time.LocalTime;

public class Solution {

    private Solution() {}
    Solution(int i) {}
    protected Solution(String s) {}
    public Solution(LocalTime time) {}

    public static void main(String[] args) {

    }
}

