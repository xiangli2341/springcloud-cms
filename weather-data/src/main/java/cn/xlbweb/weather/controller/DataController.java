package cn.xlbweb.weather.controller;

import cn.xlbweb.weather.service.IDataService;
import cn.xlbweb.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: bobi
 * @date: 2018/7/27 16:24
 * @description:
 */
@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private IDataService iDataService;

    @GetMapping("/cityName/{cityName}")
    public WeatherResponse getWeatherByCityName(@PathVariable("cityName") String cityName) {
        return iDataService.getWeatherByCityName(cityName);
    }
}
