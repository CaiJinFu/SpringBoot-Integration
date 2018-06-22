package cn.joes.repository;

import cn.joes.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by myijoes on 2018/6/22.
 */
public interface CityRepository extends JpaRepository<City, Long>{

    City findByCityName(String cityName);

    City findById(Long id);

}
