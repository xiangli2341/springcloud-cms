package cn.xlbweb.weather.service;

import cn.xlbweb.weather.vo.City;

import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 14:58
 * @description:
 */
public interface ICityService {

    /**
     * 查询所有城市数据
     *
     * @return
     */
    List<City> listCity();
}
