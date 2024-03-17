package com.example.weatherapi.controller.contract;

import com.example.weatherapi.dto.WeatherReportDTO;

public interface WeatherControllerContract {

    WeatherReportDTO getWeatherReport(String city, String country);
}
