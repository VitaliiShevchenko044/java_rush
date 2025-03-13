package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int a, int b) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(a, b));
        return Collections.min(nums);
    }

    public static int min(int a, int b, int c) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(a, b, c));
        return Collections.min(nums);
    }

    public static int min(int a, int b, int c, int d) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(a, b, c, d));
        return Collections.min(nums);
    }

    public static int min(int a, int b, int c, int d, int e) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(a, b, c, d, e));
        return Collections.min(nums);
    }

    public static int max(int a, int b) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(a, b));
        return Collections.max(nums);
    }

    public static int max(int a, int b, int c) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(a, b, c));
        return Collections.max(nums);
    }

    public static int max(int a, int b, int c, int d) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(a, b, c, d));
        return Collections.max(nums);
    }

    public static int max(int a, int b, int c, int d, int e) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(a, b, c, d, e));
        return Collections.max(nums);
    }
}
