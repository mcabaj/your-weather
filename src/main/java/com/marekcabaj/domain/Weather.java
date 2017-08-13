package com.marekcabaj.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {

    private int temperature;
    private int pressure;
    private WeatherType weatherType;
}
