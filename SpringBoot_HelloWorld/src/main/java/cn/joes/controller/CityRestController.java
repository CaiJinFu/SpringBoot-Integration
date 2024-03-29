package cn.joes.controller;

import cn.joes.domain.City;
import cn.joes.servide.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by myijoes on 06/15/2018.
 */
@Controller
public class CityRestController {

    @Autowired
    private CityService cityService;




    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public String findOneCity(@PathVariable("id") Long id, ModelMap map) {
        City city = cityService.findCityById(id);
        map.addAttribute("city", city);
        return "index";
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
