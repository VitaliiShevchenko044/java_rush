package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
    /*    for (int a = 0; a < array.length; a++) {

            for (int i = 0; i < array.length - 1 - a; i++) {
                if (array[i] == null) {
                    array[i] = array[i + 1];
                    array[i + 1] = null;
                }
            }
        }
    }*/
        String[] sortedArray = new String[array.length];
        for (int i = 0, count = 0; i < array.length; i++) {
            if (array[i] != null) {
                sortedArray[count] = array[i];
                count++;

            }
        }
        for (int i = 0; i < sortedArray.length; i++) {
            array[i] = sortedArray[i];
        }
    }
}
