package org.konneyj.module2advanced.notification;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Отправили сообщение на почту: " + message);
    }
}
