package org.konneyj.module2advanced;

import org.konneyj.module2advanced.notification.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        checkReliableClass();
        checkEqualAndHashCode();
        checkNotificationService();
    }

    public static void checkReliableClass() {
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
        System.out.println("-".repeat(50));
    }

    public static void checkEqualAndHashCode() {
        Currency currency1 = new Currency("USD", "Dollar");
        Currency currency2 = new Currency("USD", "US Dollar");
        Currency currentcy3 = new Currency("EUR", "Euro");

        System.out.println("Проверка объектов на равенство: " + currency1.equals(currency2));
        System.out.println("Проверка объектов на равенство: " + currency1.equals(currentcy3));
        System.out.println("Проверка объектов на равенство: " + currency2.equals(currentcy3));

        Set<Currency> currencies = new HashSet<>();
        currencies.add(currency1);
        currencies.add(currency2);
        System.out.println("Set должен содержать один элемент: " + currencies.size());
        currencies.add(currentcy3);
        System.out.println("Set должен содержать два элемента: " + currencies.size());

        System.out.println("-".repeat(50));
    }

    public static void checkNotificationService() {
        List<NotificationSender> list = List.of(new EmailSender(), new SmsSender(), new PushSender());
        SenderService service = new SenderService(list);
        service.send("Сообщение отправлено");
        
        System.out.println("-".repeat(50));
    }
}
