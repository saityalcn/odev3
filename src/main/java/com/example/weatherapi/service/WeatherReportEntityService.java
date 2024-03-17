package com.example.weatherapi.service;

import com.example.weatherapi.dto.WeatherDataDTO;

import com.example.weatherapi.dto.WeatherReportDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherReportEntityService {
    private final String WEATHER_API_URL = "https://api.weatherapi.com/v1";
    private final RestTemplate restTemplate;

    public WeatherReportDTO getWeatherReport(String city, String country) {
        String dailyWeatherUrl = WEATHER_API_URL + "/current.json?key=YOUR_API_KEY&q=" + city + "," + country;
        WeatherDataDTO dailyWeather = restTemplate.getForObject(dailyWeatherUrl, WeatherDataDTO.class);

        String weeklyWeatherUrl = WEATHER_API_URL + "/forecast.json?key=YOUR_API_KEY&q=" + city + "," + country + "&days=7";
        WeatherDataDTO weeklyWeather = restTemplate.getForObject(weeklyWeatherUrl, WeatherDataDTO.class);

        String monthlyWeatherUrl = WEATHER_API_URL + "/history.json?key=YOUR_API_KEY&q=" + city + "," + country + "&dt=2022-01-01";
        WeatherDataDTO monthlyWeather = restTemplate.getForObject(monthlyWeatherUrl, WeatherDataDTO.class);

        return new WeatherReportDTO(dailyWeather, weeklyWeather, monthlyWeather);
    }



}
