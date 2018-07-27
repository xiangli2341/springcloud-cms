package cn.xlbweb.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WeatherEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherEurekaApplication.class, args);
    }
}
