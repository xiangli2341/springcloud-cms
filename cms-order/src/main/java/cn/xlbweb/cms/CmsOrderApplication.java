package cn.xlbweb.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: bobi
 * @date: 2018/7/27 14:49
 * @description:
 */
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients(basePackages = "cn.xlbweb.cms.client")
public class CmsOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsOrderApplication.class, args);
    }
}
