package cn.joe.controller;

import cn.joe.domain.Car;
import cn.joe.domain.City;
import cn.joe.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by myijoes on 06/14/2018.
 */
@RestController
public class CityRestController {

    @Autowired
    private City city;

    @Autowired
    private Person person;

    @Autowired
    private Car car;

    @RequestMapping(value = "/api/get", method = RequestMethod.GET)
    public String findOneCity() {
        System.out.println(car.toString());
        System.out.println(city.toString());
        System.out.println(person.toString());
        return "";
    }

}
