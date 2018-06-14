package cn.joes.service.impl;

import cn.joes.dao.CityDao;
import cn.joes.domain.City;
import cn.joes.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by myijoes on 2018/6/14.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityDao cityDao;


    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
