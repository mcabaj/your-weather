package com.marekcabaj.services;

import com.marekcabaj.domain.DayOfWeek;
import com.marekcabaj.domain.Weather;
import com.marekcabaj.domain.WeatherType;
import com.marekcabaj.domain.WindDirection;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class WeatherGeneratorImpl implements WeatherGenerator {

    @Override
    public List<Weather> getWeatherForecast() {
        List<Weather> weatherForecast = new ArrayList<>();
        LocalDate date = LocalDate.now();
        for (int i = 0; i < 6; i++) {
            date = date.plusDays(1);
            weatherForecast.add(generateNiceWeather(new DayOfWeek(date.getDayOfWeek())));
        }
        return weatherForecast;
    }

    @Override
    public Weather getCurrentWeather() {
        return generateNiceWeather(new DayOfWeek(LocalDate.now().getDayOfWeek()));
    }

    private Weather generateNiceWeather(DayOfWeek dayOfWeek) {
        return Weather.builder()
                .temperature(generateNumber(20, 30))
                .rainChance(generateNumber(0, 10))
                .windSpeed(generateNumber(0, 5))
                .windDirection(WindDirection.randomWindDirection())
                .weatherType(WeatherType.SUNNY)
                .dayOfWeek(dayOfWeek)
                .build();
    }

    private int generateNumber(int low, int high) {
        return ThreadLocalRandom.current().nextInt(low, high);
    }
}
