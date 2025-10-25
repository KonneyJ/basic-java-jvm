package org.konneyj;

import java.util.Scanner;

public class TextAnalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String VOWELS = "aeiouyAEIOUYаоуэиыеёюяАОУЭИЫЕЁЮЯ";

        System.out.println("Введите предложение для анализа: ");
        String input = scanner.nextLine();

        // Подсчет количества слов
        String[] split = input.split(" ");
        int count = split.length;

        // Подсчет гласных и согласных
        int vowels = 0;
        int consonants = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (VOWELS.indexOf(c) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Исходное предложение: " + input);
        System.out.println("Результаты анализа");
        System.out.println("Количество слов: " + count);
        System.out.println("Количество гласных: " + vowels);
        System.out.println("Количество согласных: " + consonants);
    }
}
