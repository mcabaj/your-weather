package com.marekcabaj.domain;

import org.thymeleaf.util.StringUtils;

public enum WeatherType {
    RAINY,
    STORMY,
    SUNNY,
    CLOUDY,
    PARTLY_CLOUDY,
    SNOWY,
    WINDY,
    THUNDER,
    FOGGY;


    @Override
    public String toString() {
        return StringUtils.capitalize(super.toString());
    }
}
