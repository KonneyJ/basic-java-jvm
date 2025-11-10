package org.konneyj.module2advanced;

import java.util.List;

public class DashboardDTO {
    private String profile;
    private List<String> orders;

    public DashboardDTO(String profile, List<String> orders) {
        this.profile = profile;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "DashboardDTO{" +
                "profile='" + profile + '\'' +
                ", orders=" + orders +
                '}';
    }
}
