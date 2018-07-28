package cn.xlbweb.cms.controller;

import cn.xlbweb.cms.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 16:24
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/list")
    public List<String> list() {
        return iOrderService.list();
    }

    /**
     * 查询订单时把商品信息查出来
     *
     * @return
     */
    @GetMapping("/test1")
    public String test1() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8081/product/list", String.class);
        return response;
    }

    @GetMapping("/test2")
    public String test2() {
        // LoadBalancerClient可以根据应用名获取URL+端口,是实现客户端负载均衡的操作,故需多启实例才行,单个实例会报错
        ServiceInstance serviceInstance = loadBalancerClient.choose("CMS-PRODUCT");
        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort() + "/product/list");
        // 这里打印的URL会随机负载到每一台服务器中去
        System.out.println(url);
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }

    @GetMapping("/test3")
    public String test3() {
        String response = restTemplate.getForObject("http://CMS-PRODUCT//product/list", String.class);
        return response;
    }
}
