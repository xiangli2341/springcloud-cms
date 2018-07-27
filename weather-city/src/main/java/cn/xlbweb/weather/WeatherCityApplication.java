package cn.xlbweb.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: bobi
 * @date: 2018/7/27 14:49
 * @description:
 */
@EnableEurekaServer
@SpringBootApplication
public class WeatherCityApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherCityApplication.class, args);
    }
}
