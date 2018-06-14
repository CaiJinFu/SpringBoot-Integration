package cn.joes.dubbo.impl;

import cn.joes.domain.City;
import cn.joes.dubbo.CityDubboService;
import cn.joes.mapper.CityDao;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by myijoes on 18/6/14.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    @Autowired
    CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
