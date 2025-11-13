package org.konneyj.service;

import org.konneyj.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private String greetingMessage;
    private MessageRepository messageRepository;

    @Autowired
    public MessageService(@Value("${app.greeting}") String greetingMessage, MessageRepository messageRepository) {
        this.greetingMessage = greetingMessage;
        this.messageRepository = messageRepository;
    }

    public String getMessage() {
        return messageRepository.getMessage() + " " + greetingMessage;
    }
}
