package cn.xlbweb.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: bobi
 * @date: 2018/7/27 14:49
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WeatherDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherDataApplication.class, args);
    }
}
