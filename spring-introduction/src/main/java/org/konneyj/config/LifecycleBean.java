package org.konneyj.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LifecycleBean {
    @PostConstruct
    public void postConstruct() {
        log.info("Бин LifecycleBean создан. Выполняется метод @PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Бин LifecycleBean вот-вот будет уничтожен! ВЫполняется метод @PreDestroy");
    }
}
