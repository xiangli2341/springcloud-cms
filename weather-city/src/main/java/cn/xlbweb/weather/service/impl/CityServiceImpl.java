package cn.xlbweb.weather.service.impl;

import cn.xlbweb.weather.service.ICityService;
import cn.xlbweb.weather.util.XmlBuilder;
import cn.xlbweb.weather.vo.City;
import cn.xlbweb.weather.vo.CityList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
    public List<City> listCity() {
        try {
            Resource resource = new ClassPathResource("city-list.xml");
            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
            StringBuffer buffer = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }
            br.close();
            // XML转为Java对象
            CityList cityList = (CityList) XmlBuilder.xmlStrToOject(CityList.class, buffer.toString());
            return cityList.getCityList();
        } catch (Exception e) {
            log.error("");
        }
        return null;
    }
}
