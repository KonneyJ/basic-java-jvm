package org.konneyj.controller;

import org.konneyj.service.notificationservice.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private NotificationService notificationService;

    @Autowired
    public NotificationController(@Qualifier("emailNotificationService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/notification")
    public String getNotificationClass() {
        return String.valueOf(notificationService.getClass());
    }
}
