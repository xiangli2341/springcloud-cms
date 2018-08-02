package cn.xlbweb.cms.service;

import cn.xlbweb.cms.entity.Order;

import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 16:25
 * @description:
 */
public interface IOrderService {

    /**
     * 查询所有订单数据
     *
     * @return
     */
    List<Order> list();
}
