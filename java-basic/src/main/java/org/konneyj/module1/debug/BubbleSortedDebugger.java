package org.konneyj.module1.debug;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortedDebugger {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[random.nextInt(5, 20)];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1000);
        }

        System.out.println("Исходный массив длиной " + n + " элементов:");
        System.out.println(Arrays.toString(arr));

        // Вариант с ошибкой
        // for (int i = n; i >= 1; i--) {
        // Правильный вариант
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));
    }
}
