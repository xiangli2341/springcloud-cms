package cn.xlbweb.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: bobi
 * @date: 2018/7/27 14:49
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class CmsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsConfigApplication.class, args);
    }
}
