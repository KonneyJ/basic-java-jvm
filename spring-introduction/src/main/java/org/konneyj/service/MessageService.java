package org.konneyj.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final String greetingMessage;

    public MessageService(@Value("${app.greeting}") String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public String getMessage() {
        return greetingMessage;
    }
}
