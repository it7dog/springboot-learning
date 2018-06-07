package com.springboot.learning.restful.springbootrestful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.springboot.learning.restful.springbootrestful.dao")
public class SpringbootRestfulApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootRestfulApplication.class, args);
  }
}
