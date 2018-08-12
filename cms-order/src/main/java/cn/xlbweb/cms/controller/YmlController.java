package cn.xlbweb.cms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: bobi
 * @date: 2018/7/30 15:05
 * @description: 测试从Gitee上拉取下来的配置文件是否成功
 */
@RestController
@RequestMapping("/yml")
public class YmlController {

    @Value("${env}")
    private String env;

    @GetMapping("/env")
    public String getEnv() {
        return env;
    }
}
