package cn.joes.aop;

import java.lang.annotation.*;

/**
 * Created by myijoes on 2018/6/26.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAOP {
}
