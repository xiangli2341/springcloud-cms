package cn.xlbweb.weather.service;

/**
 * @author: bobi
 * @date: 2018/7/27 16:25
 * @description:
 */
public interface IDataService {

    /**
     * 根据城市名字称查询天气
     *
     * @param name
     * @return
     */
    String findWeather(String name);
}
