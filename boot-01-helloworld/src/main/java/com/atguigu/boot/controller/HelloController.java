package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName：HelloController
 * @Author：LiYan
 * @createDate：2023/1/9 21:06
 * @description：
 */
//@ResponseBody
//@Controller   合体
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello，Spring Boot 2！"+"你好";
    }

    //
    @RequestMapping("/car")
    public Car Mycar() {
        return car;
    }
}
