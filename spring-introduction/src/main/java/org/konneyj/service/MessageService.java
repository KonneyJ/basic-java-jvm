package org.konneyj.service;

import lombok.extern.slf4j.Slf4j;
import org.konneyj.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
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

    public void testCommandLineRunner() {
        log.info("Выполняется метод из внедренного MessageService");
    }
}
