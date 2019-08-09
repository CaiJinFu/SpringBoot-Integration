package cn.joes.controller;

import cn.joes.domain.City;
import cn.joes.servide.CityService;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

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


    public static void main(String[] args) {
        List<String> a = Lists.newArrayList();
        Set<String> b = Sets.newHashSet();
        a.stream().forEach(c -> {
            System.out.println(c);
        });
    }
}
