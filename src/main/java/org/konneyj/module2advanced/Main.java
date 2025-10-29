package org.konneyj.module2advanced;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount("", 1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Получено исключение " + e.getClass());
            System.out.println(e.getMessage());
        }

        try {
            BankAccount account = new BankAccount("John", -1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Получено исключение " + e.getClass());
            System.out.println(e.getMessage());
        }

        try {
            BankAccount account = new BankAccount(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Получено исключение " + e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
