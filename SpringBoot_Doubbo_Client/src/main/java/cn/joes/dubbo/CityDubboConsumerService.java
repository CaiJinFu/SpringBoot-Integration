package cn.joes.dubbo;

import cn.joes.domain.City;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * 城市 Dubbo 服务消费者
 *
 * Created by myijoes on 18/6/14.
 */
@Component
public class CityDubboConsumerService {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public City printCity(String cityName) {
        return cityDubboService.findCityByName(cityName);
    }
}
