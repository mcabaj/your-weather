package com.marekcabaj.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Weather {

    private int temperature;
    private int nightTemperature;
    private int rainChance;
    private int windSpeed;
    private WindDirection windDirection;
    private WeatherType weatherType;
    private DayOfWeek dayOfWeek;
}
