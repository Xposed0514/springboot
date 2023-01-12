package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @FileName：Person
 * @Author：LiYan
 * @createDate：2023/1/12 19:50
 * @description：
 */
@ConfigurationProperties(prefix = "person")
@Component
@ToString
@Data
public class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;
}
