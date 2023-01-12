package com.atguigu.boot.bean;

import lombok.Data;

/**
 * @FileName：User
 * @Author：LiYan
 * @createDate：2023/1/10 19:43
 * @description：用户
 */
@Data
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
