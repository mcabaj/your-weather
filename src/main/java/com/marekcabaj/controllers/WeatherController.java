package com.marekcabaj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {

    @RequestMapping("/")
    public String mainPage() {
        return "index";
    }
}