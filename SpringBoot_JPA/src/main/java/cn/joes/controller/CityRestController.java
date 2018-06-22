package cn.joes.controller;

import cn.joes.domain.City;
import cn.joes.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by myijoes on 06/14/2018.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityRepository cityRepository;

    @RequestMapping(value = "/api/city/{cityName}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable(value = "cityName", required = true) String cityName) {
        return cityRepository.findByCityName(cityName);
    }

    @RequestMapping(value = "/api/city/id/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable(value = "id", required = true) Long id) {
        return cityRepository.findById(id);
    }

    @RequestMapping(value = "/api/city/save", method = RequestMethod.POST)
    public City saveCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

}
