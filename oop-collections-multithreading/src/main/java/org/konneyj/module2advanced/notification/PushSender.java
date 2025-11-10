package org.konneyj.module2advanced.notification;

public class PushSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Отправили сообщение в пуш-уведомление: " + message);
    }
}
