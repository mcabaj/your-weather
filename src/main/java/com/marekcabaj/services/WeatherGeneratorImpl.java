package com.marekcabaj.services;

import com.marekcabaj.domain.Weather;
import com.marekcabaj.domain.WeatherType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class WeatherGeneratorImpl implements WeatherGenerator {

    @Override
    public List<Weather> getWeatherForecast() {
        List<Weather> weatherForecast = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            weatherForecast.add(generateSunnyWeather());
        }
        return weatherForecast;
    }

    @Override
    public Weather getCurrentWeather() {
        return generateSunnyWeather();
    }

    private Weather generateSunnyWeather() {
        return new Weather(generateNumber(20, 30), generateNumber(990, 1030), WeatherType.SUNNY);
    }

    private int generateNumber(int low, int high) {
        return ThreadLocalRandom.current().nextInt(low, high);
    }
}
