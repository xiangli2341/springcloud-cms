package cn.xlbweb.cms.service.impl;

import cn.xlbweb.cms.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 16:25
 * @description:
 */
@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {

    @Override
    public List<String> list() {
        List<String> list = new ArrayList<>();
        list.add("00001");
        list.add("00002");
        list.add("00003");
        list.add("00004");
        list.add("00005");
        return list;
    }
}
