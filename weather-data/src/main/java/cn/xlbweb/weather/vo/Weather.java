package cn.xlbweb.weather.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 16:24
 * @description: 天气信息
 */
@Data
public class Weather implements Serializable {

	private static final long serialVersionUID = 1L;
	private String city;
	private String aqi;
	private String ganmao;
	private String wendu;
	private Yeaterday yesterday;
	private List<Forecast> forecast;
}
