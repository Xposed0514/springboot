package com.atguigu.boot.controller;

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

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello，Spring Boot 2！";
    }
}
