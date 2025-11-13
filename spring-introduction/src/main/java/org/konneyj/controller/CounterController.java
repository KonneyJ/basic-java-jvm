package org.konneyj.controller;

import org.springframework.context.ApplicationContext;
import org.konneyj.beancounter.BeanCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    @Autowired
    private final ApplicationContext context;

    public CounterController(ApplicationContext context) {
        this.context = context;
    }

    @GetMapping("/counter")
    public String getBeanCount() {
        BeanCounter counter1 = context.getBean(BeanCounter.class);
        BeanCounter counter2 = context.getBean(BeanCounter.class);

        String result = "Значение счетчика counter1 = " + counter1.getCount();
        result += " Значение счетчика counter2 = " + counter2.getCount();

        counter1.increaseCount();
        result += " Значение счетчика counter1 после ручного увеличения = " + counter1.getCount();
        result += " Значение счетчика counter2 при этом = " + counter2.getCount();
        return result;
    }
}
