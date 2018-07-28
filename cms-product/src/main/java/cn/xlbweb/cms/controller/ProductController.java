package cn.xlbweb.cms.controller;

import cn.xlbweb.cms.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 14:49
 * @description:
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/list")
    public List<String> list() {
        return iProductService.list();
    }
}
