package org.konneyj.module2advanced.notification;

import java.util.List;

public class SenderService {
    private final List<NotificationSender> senders;

    public SenderService(List<NotificationSender> senders) {
        this.senders = senders;
    }

    public void send(String message) {
        for(NotificationSender sender : senders) {
            sender.send(message);
        }
    }
}
