package cn.xlbweb.cms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: bobi
 * @date: 2018/7/29 01:48
 * @description:
 */
@RestController
@FeignClient(name = "CMS-PRODUCT")
public interface ProductClient {

    @GetMapping("/product/list")
    String list();
}
