package cn.joes.dao;

import cn.joes.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 * Created by myijoes on 2018/6/14.
 */

public interface CityDao {


    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}
