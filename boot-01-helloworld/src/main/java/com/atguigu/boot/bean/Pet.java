package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @FileName：Pet
 * @Author：LiYan
 * @createDate：2023/1/10 19:42
 * @description：宠物
 */
@Data
@ToString //toString 方法
@NoArgsConstructor // 无参构造器
@AllArgsConstructor // 全参构造器
public class Pet {
    private String name;
}
