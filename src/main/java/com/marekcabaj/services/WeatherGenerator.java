package com.marekcabaj.services;

import com.marekcabaj.domain.Weather;

import java.util.List;

public interface WeatherGenerator {

    List<Weather> getWeatherForecast();

    Weather getCurrentWeather();
}
