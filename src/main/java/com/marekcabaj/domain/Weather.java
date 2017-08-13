package com.marekcabaj.domain;

import lombok.Builder;
import lombok.Data;

import java.time.DayOfWeek;

@Data
@Builder
public class Weather {

    private int temperature;
    private int rainChance;
    private int windSpeed;
    private WindDirection windDirection;
    private WeatherType weatherType;
    private DayOfWeek dayOfWeek;
}