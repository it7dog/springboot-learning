package com.springboot.learning.restful.springbootrestful.service;

import com.springboot.learning.restful.springbootrestful.domain.City;

import java.util.List;

/**
 * @author: wangw
 * @date: 2018/6/6 21:34
 * @description:
 */
public interface CityService {
  /**
   * 获取城市信息列表
   *
   * @return
   */
  List<City> findAllCity();

  /**
   * 根据城市 ID,查询城市信息
   *
   * @param id
   * @return
   */
  City findCityById(Long id);

  /**
   * 新增城市信息
   *
   * @param city
   * @return
   */
  Long saveCity(City city);

  /**
   * 更新城市信息
   *
   * @param city
   * @return
   */
  Long updateCity(City city);

  /**
   * 根据城市 ID,删除城市信息
   *
   * @param id
   * @return
   */
  Long deleteCity(Long id);
}
