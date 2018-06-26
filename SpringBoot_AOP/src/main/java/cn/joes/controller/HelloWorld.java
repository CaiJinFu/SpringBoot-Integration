package cn.joes.controller;

import cn.joes.aop.MyAOP;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.*;

/**
 * Created by myijoes on 2018/6/25.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    @MyAOP
    //@Pointcut(argNames = "webLog")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }


}
