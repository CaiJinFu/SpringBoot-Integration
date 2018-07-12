package cn.joes.controller;

import cn.joes.domain.City;
import cn.joes.repository.City2Repository;
import cn.joes.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by myijoes on 06/14/2018.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private City2Repository city2Repository;

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

    @RequestMapping(value = "/api/city/provinceId/{provinceId}", method = RequestMethod.GET)
    public City findByProvinceId(@PathVariable(value = "provinceId", required = true) Long provinceId) {
        return cityRepository.findByProvinceId(provinceId);
    }

    @RequestMapping(value = "/api/city/test/{test}", method = RequestMethod.GET)
    public City findByTest(@PathVariable(value = "test", required = true) String test) {
        return cityRepository.findByTestTestTestTest(test);
    }

    @RequestMapping(value = "/city/like/{cityName}", method = RequestMethod.GET)
    public List<City> findByCityNameLike(@PathVariable(value = "cityName", required = true) String cityName) {
        return cityRepository.findByCityNameLike("%" + cityName + "%");
    }

    @RequestMapping(value = "/city/id/{id}", method = RequestMethod.GET)
    public City queryById(@PathVariable(value = "id", required = true) Long id) {
        return city2Repository.queryById(id);
    }

}
