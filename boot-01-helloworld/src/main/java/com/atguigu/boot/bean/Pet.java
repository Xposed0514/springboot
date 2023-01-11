package com.atguigu.boot.bean;

/**
 * @FileName：Pet
 * @Author：LiYan
 * @createDate：2023/1/10 19:42
 * @description：宠物
 */
public class Pet {
    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
