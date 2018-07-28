package cn.xlbweb.cms.controller;

import cn.xlbweb.cms.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/list")
    public List<String> list() {
        return iOrderService.list();
    }
}
