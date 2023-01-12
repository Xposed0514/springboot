package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName：HelloController
 * @Author：LiYan
 * @createDate：2023/1/9 21:06
 * @description：
 */
@Slf4j
//@ResponseBody
//@Controller   合体
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name, @RequestParam("sex") String sex) {
        log.info("请求开始了。。。。。");
        return "Hello，Spring Boot 2！" + "你好:" + name + "——性别：" + sex;
    }

    //
    @RequestMapping("/car")
    public Car Mycar() {
        return car;
    }
}
