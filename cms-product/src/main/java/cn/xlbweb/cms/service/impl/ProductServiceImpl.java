package cn.xlbweb.cms.service.impl;

import cn.xlbweb.cms.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 14:58
 * @description:
 */
@Service
@Slf4j
public class ProductServiceImpl implements IProductService {

    @Override
    public List<String> list() {
        List<String> list = new ArrayList<>();
        list.add("番茄炒蛋");
        list.add("红椒肉丝");
        list.add("盐煎肉");
        list.add("莲白炒肉");
        list.add("鱼香肉丝");
        return list;
    }
}
