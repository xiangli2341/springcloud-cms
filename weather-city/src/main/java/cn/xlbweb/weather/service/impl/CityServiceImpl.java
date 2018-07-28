package cn.xlbweb.weather.service.impl;

import cn.xlbweb.weather.service.ICityService;
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
public class CityServiceImpl implements ICityService {

    @Override
    public List<String> listCity() {
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("上海");
        list.add("广州");
        list.add("深圳");
        list.add("成都");
        return list;
    }
}
