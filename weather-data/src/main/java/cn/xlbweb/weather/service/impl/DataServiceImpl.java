package cn.xlbweb.weather.service.impl;

import cn.xlbweb.weather.service.IDataService;
import cn.xlbweb.weather.vo.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @author: bobi
 * @date: 2018/7/27 16:25
 * @description:
 */
@Service
@Slf4j
public class DataServiceImpl implements IDataService {

//    @Autowired
//    private RestTemplate restTemplate;

    @Override
    public WeatherResponse getWeatherByCityName(String cityName) {
        try {
            String url = "http://wthrcdn.etouch.cn/weather_mini?city=" + cityName;
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> respString = restTemplate.getForEntity(url, String.class);
            ObjectMapper mapper = new ObjectMapper();
            WeatherResponse resp = mapper.readValue(respString.getBody(), WeatherResponse.class);
            return resp;
        } catch (IOException e) {
            log.error("查询天气失败", e);
            return null;
        }
    }
}
