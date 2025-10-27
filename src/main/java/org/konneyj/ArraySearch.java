package org.konneyj;

import java.util.Arrays;
import java.util.Random;

public class ArraySearch {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1, 20);
        }

        System.out.println("Значения в массиве: ");
        System.out.println(Arrays.toString(nums));
        
        int maxDigit = searchMax(nums);
        System.out.println("Максимальное значение в массиве: " + maxDigit);

        int searchDigit = random.nextInt(1, 20);
        int result = searchDigit(nums, searchDigit);
        System.out.println("Результат поиска числа " + searchDigit + ": " + result);
    }

    public static int searchMax(int[] nums) {
        int maxDigit = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxDigit) {
                maxDigit = nums[i];
            }
        }
        return maxDigit;
    }

    public static int searchDigit(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
