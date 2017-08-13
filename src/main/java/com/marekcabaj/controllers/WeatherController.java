package com.marekcabaj.controllers;

import com.marekcabaj.services.WeatherGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {

    private WeatherGenerator weatherGenerator;

    @Autowired
    public WeatherController(WeatherGenerator weatherGenerator) {
        this.weatherGenerator = weatherGenerator;
    }

    @RequestMapping("{city}")
    public String mainPage(@PathVariable String city,  Model model) {
        if(city == null || city.isEmpty()) {
            city = "Cracow";
        }
        model.addAttribute("weatherForecast", weatherGenerator.getWeatherForecast());
        model.addAttribute("currentWeather", weatherGenerator.getCurrentWeather());
        model.addAttribute("city", city);
        return "index";
    }
}
