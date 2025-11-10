package org.konneyj.module2advanced.notification;

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Отправили сообщение смской: " + message);
    }
}
