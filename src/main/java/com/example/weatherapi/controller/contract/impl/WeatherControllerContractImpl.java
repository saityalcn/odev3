package com.example.weatherapi.controller.contract.impl;

import com.example.weatherapi.controller.contract.WeatherControllerContract;
import com.example.weatherapi.dto.WeatherReportDTO;
import com.example.weatherapi.service.WeatherReportEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherControllerContractImpl implements WeatherControllerContract {
    private final WeatherReportEntityService weatherReportEntityService;
    @Override
    public WeatherReportDTO getWeatherReport(String city, String country) {
        return weatherReportEntityService.getWeatherReport(city, country);
    }
}
