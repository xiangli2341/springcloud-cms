package cn.xlbweb.weather.controller;

import cn.xlbweb.weather.service.ICityService;
import cn.xlbweb.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 14:49
 * @description:
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private ICityService iCityService;

    @GetMapping("/list")
    public List<City> listCity() {
        return iCityService.listCity();
    }
}
