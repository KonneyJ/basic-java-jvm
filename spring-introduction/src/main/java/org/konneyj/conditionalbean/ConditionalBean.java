package org.konneyj.conditionalbean;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "feature.toggle.enable", havingValue = "true", matchIfMissing = false)
@Slf4j
public class ConditionalBean {
    @PostConstruct
    public void getStatus() {
        log.info("Бин ConditionalBean успешно создан");
    }
}
