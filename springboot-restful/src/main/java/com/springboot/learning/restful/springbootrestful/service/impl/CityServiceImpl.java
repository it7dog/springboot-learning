package com.springboot.learning.restful.springbootrestful.service.impl;

import com.springboot.learning.restful.springbootrestful.dao.CityDao;
import com.springboot.learning.restful.springbootrestful.domain.City;
import com.springboot.learning.restful.springbootrestful.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wangw
 * @date: 2018/6/6 21:35
 * @description:
 */
@Service
public class CityServiceImpl implements CityService {

  @Autowired
  private CityDao cityDao;

  @Override
  public List<City> findAllCity() {
    return cityDao.findAllCity();
  }

  @Override
  public City findCityById(Long id) {
    return cityDao.findById(id);
  }

  @Override
  public Long saveCity(City city) {
    return cityDao.saveCity(city);
  }

  @Override
  public Long updateCity(City city) {
    return cityDao.updateCity(city);
  }

  @Override
  public Long deleteCity(Long id) {
    return cityDao.deleteCity(id);
  }
}
