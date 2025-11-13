package org.konneyj.module3;

import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        checkGuava();
    }

    public static void checkGuava() {
        String testString = "Не пустая строка!";
        String testString1 = "";
        String testString2 = null;
        List<String> strings = new ArrayList<>(List.of(testString, testString1));

        for (String str : strings) {
            if (Strings.isNullOrEmpty(str)) {
                System.out.println("Строка пустая. Бибилиотека Guava работает");
            } else {
                System.out.println("Строка не пустая: " + str);
            }
        }

        if (Strings.isNullOrEmpty(testString2)) {
            System.out.println("Строка равна: " + testString2 + " Библиотека Guava работает");
        }
    }
}