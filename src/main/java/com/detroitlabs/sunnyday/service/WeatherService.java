package com.detroitlabs.sunnyday.service;

import com.detroitlabs.sunnyday.model.Forecast;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {
    public Forecast fetchWeatherData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "http://api.openweathermap.org/" +
                        "data/2.5/weather?q=Detroit" +
                        "&APPID=0aca13fa8c783e0bad9d2055bcabbfce", Forecast.class);


    }
}
