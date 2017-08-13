package com.marekcabaj.domain;

import org.apache.commons.lang3.StringUtils;

public class DayOfWeek {
    java.time.DayOfWeek dayOfWeek;

    public DayOfWeek(java.time.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return StringUtils.capitalize(dayOfWeek.toString().toLowerCase());
    }
}
