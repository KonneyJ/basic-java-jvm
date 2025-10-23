package org.konneyj;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Вас приветствует калькулятор! Введите 2 числа и операцию, которую нужно выполнить +, -, *, / или введите 'exit' " +
                    "для выхода из программы");
            System.out.println("Введите команду: ");
            System.out.println("1 - посчитать значение");
            System.out.println("2 - exit");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите первое число");
                double firstNumber = scanner.nextDouble();

                System.out.println("Введите второе число");
                double secondNumber = scanner.nextDouble();

                System.out.println("Введите обозначение операции, которую нужно выполнить - '+', '-', '*', '/'");
                String operation = scanner.next();
                double result;
                switch (operation) {
                    case "+":
                        result = firstNumber + secondNumber;
                        System.out.println("Результат вычисления: " + result);
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        System.out.println("Результат вычисления: " + result);
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        System.out.println("Результат вычисления: " + result);
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        System.out.println("Результат вычисления: " + result);
                        break;
                    default:
                        System.out.println("Введена неизвестная операция");
                }
            } else if (command == 2) {
                break;
            } else {
                System.out.println("Неизвестная команда");
            }
        }
    }
}
