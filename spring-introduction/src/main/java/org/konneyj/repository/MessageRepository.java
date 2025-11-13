package org.konneyj.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    private String messageRepository;

    @Autowired
    public MessageRepository(@Value("${app.repository}") String messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String getMessage() {
        return messageRepository;
    }
}
