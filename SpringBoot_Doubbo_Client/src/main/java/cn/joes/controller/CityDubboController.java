package cn.joes.controller;

import cn.joes.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by myijoes on 2018/6/14.
 */

@RestController
public class CityDubboController {

    @Autowired
    private CityDubboConsumerService cityDubboConsumerService;

    /**
     *
     */
    @RequestMapping(value = "/dubbo/city", method = RequestMethod.GET)
    public String queryCity (@RequestParam(value = "cityName", required = true) String cityName) {
        return cityDubboConsumerService.printCity(cityName).toString();
    }

}
