package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @FileName：Pet
 * @Author：LiYan
 * @createDate：2023/1/12 19:51
 * @description：
 */
@Data
@ToString
public class Pet {
    private String name;
    private Double weight;
}
