package cn.xlbweb.cms.service.impl;

import cn.xlbweb.cms.entity.Order;
import cn.xlbweb.cms.repository.OrderRepository;
import cn.xlbweb.cms.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> list() {
        return orderRepository.findAll();
    }
}
