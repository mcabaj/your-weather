package com.marekcabaj.controllers;

import com.marekcabaj.services.WeatherGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

@Controller
public class WeatherController {

    private WeatherGenerator weatherGenerator;

    @Autowired
    public WeatherController(WeatherGenerator weatherGenerator) {
        this.weatherGenerator = weatherGenerator;
    }

    @RequestMapping("/")
    public String mainPage(Model model) {
        addWeatherAttributes("cracow", model);
        return "index";
    }

    @RequestMapping("{city}")
    public String cityWeather(@PathVariable String city,  Model model) {
        addWeatherAttributes(city, model);
        return "index";
    }

    private void addWeatherAttributes(@PathVariable String city, Model model) {
        model.addAttribute("weatherForecast", weatherGenerator.getWeatherForecast());
        model.addAttribute("currentWeather", weatherGenerator.getCurrentWeather());
        model.addAttribute("city", StringUtils.capitalize(city));
    }
}
