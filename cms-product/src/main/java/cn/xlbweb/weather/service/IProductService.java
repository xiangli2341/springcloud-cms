package cn.xlbweb.weather.service;

import java.util.List;

/**
 * @author: bobi
 * @date: 2018/7/27 14:58
 * @description:
 */
public interface IProductService {

    /**
     * 查询所有商品数据
     *
     * @return
     */
    List<String> list();
}
