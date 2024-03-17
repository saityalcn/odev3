package com.example.weatherapi.dto;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WeatherReportDTO {
    private WeatherDataDTO dailyWeather;
    private WeatherDataDTO weeklyWeather;
    private WeatherDataDTO monthlyWeather;

}
