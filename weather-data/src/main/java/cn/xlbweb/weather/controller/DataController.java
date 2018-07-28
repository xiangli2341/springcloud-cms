package cn.xlbweb.weather.controller;

import cn.xlbweb.weather.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    /**
     * 根据城市名字获取天气数据
     *
     * @param name
     * @return
     */
    @GetMapping
    public String getWeather(String name) {
        return iDataService.findWeather(name);
    }
}
