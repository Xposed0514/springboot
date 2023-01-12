package com.atguigu.boot.controller;


import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName：HelloController
 * @Author：LiYan
 * @createDate：2023/1/12 20:08
 * @description：
 */
@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}
