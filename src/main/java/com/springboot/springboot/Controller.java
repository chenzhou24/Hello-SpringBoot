package com.springboot.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping("/hello")
    public String hello(){
      return "hello springboot";
    }
}
