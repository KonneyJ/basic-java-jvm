package org.konneyj;

import lombok.extern.slf4j.Slf4j;
import org.konneyj.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommandLineRunnerImpl implements CommandLineRunner {
    private MessageService messageService;

    @Autowired
    public CommandLineRunnerImpl(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Приложение стартовало. Выполняется метод run() в классе CommandLineRunnerImpl");
        messageService.testCommandLineRunner();
        log.info("Выполнение метода run() в классе CommandLineRunnerImpl завершено");
    }
}
