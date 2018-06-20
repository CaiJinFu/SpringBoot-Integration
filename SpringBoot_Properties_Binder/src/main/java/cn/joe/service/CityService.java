package cn.joe.service;

import cn.joe.domain.City;

/**
 * 城市业务逻辑接口类
 *
 * Created by myijoes on 06/14/2018.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
