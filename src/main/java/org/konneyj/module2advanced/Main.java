package org.konneyj.module2advanced;

import org.konneyj.module2advanced.notification.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        checkReliableClass();
        checkEqualAndHashCode();
        checkNotificationService();
        checkListAndHashMap();
        checkComparableAndComparator();
        checkThreadAndRunnable();
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

    public static void checkListAndHashMap() {
        List<String> emails = List.of("julie@yandex.ru", "dima@gmail.com", "sofia@yandex.ru", "dima@gmail.com",
                "julie@yandex.ru");
        System.out.println("Размер списка emailов: " + emails.size());

        Set<String> emailSet = new HashSet<>();
        for (String email : emails) {
            emailSet.add(email);
        }
        System.out.println("Размер сета emailов: " + emailSet.size());

        Map<String, Integer> domains = new HashMap<>();
        for (String email : emails) {
            String domain = email.split("@")[1];
            domains.put(domain, domains.getOrDefault(domain, 0) + 1);
        }
        System.out.println("Список уникальных доменов и их количество");
        System.out.println(domains.keySet());
        System.out.println(domains.values());

        System.out.println("-".repeat(50));
    }

    public static void checkComparableAndComparator() {
        List<Product> products = new ArrayList<>(List.of(new Product("Сыр", 0.3, 250),
                new Product("Молоко", 1, 90),
                new Product("Рис", 0.8, 100),
                new Product("Стиральный порошок", 3.0, 400)));

        // Comparable для сортировке по цене
        Collections.sort(products);
        System.out.println("Сортировка списка по цене");
        for (Product product : products) {
            System.out.println(product);
        }

        // Comparator для сортировки по названию
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Сортировка списка по названию");
        for (Product product : products) {
            System.out.println(product);
        }

        // Comparator для весу в обратном порядке
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getWeight(), o1.getWeight());
            }
        });

        System.out.println("Сортировка списка по весу в обратном порядке");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("-".repeat(50));
    }

    public static void checkThreadAndRunnable() throws InterruptedException {
        List<Downloader> loaders = new ArrayList<>(List.of(new Downloader(), new Downloader(), new Downloader(),
                new Downloader(), new Downloader()));

        long startTime1 = System.nanoTime();

        for (Downloader loader : loaders) {
            loader.run();
        }
        long endTime1 = System.nanoTime();
        long diff1 = (endTime1 - startTime1) / 1_000_000_000;
        System.out.println("Время выполнения потоков последовательно: " + diff1 + " секунд");

        List<Thread> threads = new ArrayList<>();
        Downloader downloader = new Downloader();
        Thread thread1 = new Thread(downloader);
        Thread thread2 = new Thread(downloader);
        Thread thread3 = new Thread(downloader);
        Thread thread4 = new Thread(downloader);
        Thread thread5 = new Thread(downloader);

        threads.addAll(List.of(thread1, thread2, thread3, thread4, thread5));
        long startTime2 = System.nanoTime();

        for (Thread thr : threads) {
            thr.start();
        }
        thread5.join();

        long endTime2 = System.nanoTime();
        long diff2 = (endTime2 - startTime2) / 1_000_000_000;
        System.out.println("Время выполнения потоков параллельно: " + diff2 + " секунд");
    }
}
