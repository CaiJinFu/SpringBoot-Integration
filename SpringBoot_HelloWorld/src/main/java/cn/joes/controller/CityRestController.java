package cn.joes.controller;

import cn.joes.domain.City;
import cn.joes.servide.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by myijoes on 06/15/2018.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;




    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public ModelAndView findOneCity(@PathVariable("id") Long id) {
        City city = cityService.findCityById(id);
        ModelAndView model = new ModelAndView();
        model.setViewName("templates/index.html");
        model.addObject("city",city);
        return model;
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
