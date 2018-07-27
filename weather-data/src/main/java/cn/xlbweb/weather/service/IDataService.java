package cn.xlbweb.weather.service;

import cn.xlbweb.weather.vo.WeatherResponse;

/**
 * @author: bobi
 * @date: 2018/7/27 16:25
 * @description:
 */
public interface IDataService {

    /**
     * 根据城市名称查询天气
     *
     * @param cityName
     * @return
     */
    WeatherResponse getWeatherByCityName(String cityName);
}
