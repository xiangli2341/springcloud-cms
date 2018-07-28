package cn.xlbweb.weather.service.impl;

import cn.xlbweb.weather.service.IDataService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author: bobi
 * @date: 2018/7/27 16:25
 * @description:
 */
@Service
@Slf4j
public class DataServiceImpl implements IDataService {

///    @Autowired
///    private RestTemplate restTemplate;

    @Override
    public String findWeather(String name) {
        return "天气晴,温度45C,不适合出门...";
    }
}
