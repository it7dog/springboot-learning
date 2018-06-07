package com.springboot.learning.springboothello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangw
 * @date: 2018/6/6 21:14
 * @description:
 */
@RestController
public class HelloWorldController {
  @RequestMapping("/")
  public String sayHello(){
    return "Hello,world!";
  }
}
