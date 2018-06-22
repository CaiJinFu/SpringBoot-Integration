package cn.joes.controller;

import cn.joes.domain.City;
import cn.joes.servide.CityService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by myijoes on 06/15/2018.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @ApiOperation(value = "通过请求获取city的信息", notes = "id=2")
    @ApiImplicitParam(name = "id", value = "城市id", required = true, dataType = "Integer")
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

}
