package com.example.graphQL_playground.controller.lec02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class AgeRangeFilter {
    private Integer minAge;
    private Integer maxAge;

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }
}
