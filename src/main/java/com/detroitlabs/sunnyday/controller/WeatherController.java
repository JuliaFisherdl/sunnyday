package com.detroitlabs.sunnyday.controller;

import com.detroitlabs.sunnyday.model.Forecast;
import com.detroitlabs.sunnyday.model.Temperature;
import com.detroitlabs.sunnyday.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {
    @Autowired
    WeatherService weatherService = new WeatherService();
    @ResponseBody
    @RequestMapping("/sunnyday")
    public String displayWeather() {
    Forecast forecast = weatherService.fetchWeatherData();
    Temperature temperature = forecast.getTemperature();
    double tempFar = (((temperature.getTemp()-273.15)*1.8) +32);
    double roundedtemp = Math.round(tempFar);
    String temperatureString = String.valueOf(roundedtemp);
    String humidityString = String.valueOf(temperature.getHumidity());
    return "The current temperature in " + forecast.getName() + " " + temperatureString + "degrees Fahrenheit. The current humidity is " + humidityString+ "%";

    }
}
