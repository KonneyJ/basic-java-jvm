package org.konneyj.beancounter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanCounter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increaseCount() {
        count++;
    }

    @Override
    public String toString() {
        return "BeanCounter{" +
                "count=" + count +
                ", hash= " + this.hashCode() +
                '}';
    }
}
