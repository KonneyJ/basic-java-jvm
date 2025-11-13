package org.konneyj.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public void getMessage() {
        System.out.println("Сообщение получено");
    }
}
