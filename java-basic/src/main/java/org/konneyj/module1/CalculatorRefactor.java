package org.konneyj.module1;

import java.util.Scanner;

public class CalculatorRefactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите первое число");
                double firstNumber = scanner.nextDouble();

                System.out.println("Введите второе число");
                double secondNumber = scanner.nextDouble();

                System.out.println("Введите обозначение операции, которую нужно выполнить - '+', '-', '*', '/'");
                String operation = scanner.next();

                switch (operation) {
                    case "+":
                        countSum(firstNumber, secondNumber);
                        break;
                    case "-":
                        countDiff(firstNumber, secondNumber);
                        break;
                    case "*":
                        countProduct(firstNumber, secondNumber);
                        break;
                    case "/":
                        countDivision(firstNumber, secondNumber);
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

    public static void printMenu() {
        System.out.println("Вас приветствует калькулятор! Введите 2 числа и операцию, которую нужно выполнить +, -, *, / или введите 'exit' " +
                "для выхода из программы");
        System.out.println("Введите команду: ");
        System.out.println("1 - посчитать значение");
        System.out.println("2 - exit");
    }

    public static void countSum(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.println("Результат вычисления: " + result);
    }

    public static void countDiff(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        System.out.println("Результат вычисления: " + result);
    }

    public static void countProduct(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.println("Результат вычисления: " + result);
    }

    public static void countDivision(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Делить на ноль нельзя!");
            return;
        }
        double result = firstNumber / secondNumber;
        System.out.println("Результат вычисления: " + result);
    }
}
