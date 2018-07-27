package cn.xlbweb.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: bobi
 * @date: 2018/7/27 16:24
 * @description: 未来天气
 */
@Data
public class WeatherResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private Weather data;
    private Integer status;
    private String desc;
}
