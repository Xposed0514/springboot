package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @FileName：car
 * @Author：LiYan
 * @createDate：2023/1/11 18:59
 * @description：只有在容器中的组件，才会拥有SpringBoot 提供的强大功能
 *
 * 利用配置文件赋值
 * 1、@Component
 *      @ConfigurationProperties(prefix = "mycar")
 * 2、配置类里加注解
 *      @EnableConfigurationProperties(Car.class) // 1、开始Car的属性配置功能
 */
@Data
@ToString
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
