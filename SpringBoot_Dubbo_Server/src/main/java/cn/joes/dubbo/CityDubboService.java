package cn.joes.dubbo;

import cn.joes.domain.City;

/**
 * 城市业务 Dubbo 服务层
 *
 * Created by myijoes on 18/6/14.
 */
public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
