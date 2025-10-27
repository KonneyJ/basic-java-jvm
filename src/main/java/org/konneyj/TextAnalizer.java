package org.konneyj;

import java.util.Scanner;
import java.util.Set;

public class TextAnalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Character> vowel = Set.of('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y', 'а', 'о', 'у', 'э',
                'и', 'ы', 'е', 'ё', 'ю', 'я', 'А', 'О', 'У', 'Э', 'И', 'Ы', 'Е', 'Ё', 'Ю', 'Я');

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
                if (vowel.contains(c)) {
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
