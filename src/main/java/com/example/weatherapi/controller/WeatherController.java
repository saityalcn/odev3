package com.example.weatherapi.controller;

import com.example.weatherapi.controller.contract.WeatherControllerContract;
import com.example.weatherapi.dto.WeatherReportDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
class WeatherController {
    private final WeatherControllerContract controllerContract;
    @GetMapping
    public WeatherReportDTO getWeatherReport(@RequestParam String city, @RequestParam String country) {
        return controllerContract.getWeatherReport(city, country);
    }
}
