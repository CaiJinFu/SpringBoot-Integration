package cn.joe.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.lang.model.element.Name;

/**
 * Created by myijoes on 2018/6/20.
 */
@ConfigurationProperties(prefix = "car")
public class Car {
    private Integer id;

    private String name;

    private Long speed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
