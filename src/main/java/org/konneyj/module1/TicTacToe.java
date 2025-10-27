package org.konneyj.module1;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] field = new char[3][3];

        // Текущий игрок Х или О
        char currentPlayer = 'X';

        // Заполнение поля пустыми ячейками
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = ' ';
            }
        }

        while (true) {
            printField(field);
            System.out.println("Ход игрока " + currentPlayer);
            System.out.print("Введите координаты от 1 до 3 (строка и столбец через пробел): ");

            // Чтение ввода пользователя
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Проверка корректности хода
            if (makeMove(row, col, field, currentPlayer)) {
                printField(field);

                // Смена игрока
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
            }
        }
    }

    public static void printField(char[][] field) {
        System.out.println("Текущее состояние поля:");
        for (int i = 0; i < 3; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-".repeat(15));
        }
    }

    public static boolean makeMove(int row, int col, char[][] field, char currentPlayer) {
        // Проверка корректности координат
        if (row < 1 || row > 3 || col < 1 || col > 3) {
            System.out.println("Ошибка: координаты вне поля!");
            return false;
        }

        // Приведение координат к индексации массива
        row--;
        col--;

        // Проверка, что ячейка свободна
        if (field[row][col] != ' ') {
            System.out.println("Ошибка: ячейка уже занята!");
            return false;
        }

        // Установка символа текущего игрока
        field[row][col] = currentPlayer;
        return true;
    }
}
