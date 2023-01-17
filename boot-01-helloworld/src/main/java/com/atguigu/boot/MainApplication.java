package com.atguigu.boot;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @FileName：MainApplication
 * @Author：LiYan
 * @createDate：2023/1/9 21:03
 * @description： 主程序类
 * 只是一个SpringBoot应用
 */
//(scanBasePackages = "com.atguigu")：改变默认包扫描范围 路径即可
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        //1、返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        //3、从容器获取组件
        // 第一种方法
//        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        System.out.println(context.getBean("user01"));
//        System.out.println(context.getBean("tom"));
//        // 第二种方法
//        Pet tom01 = run.getBean("tom", Pet.class);
//        Pet tom02 = run.getBean("tom", Pet.class);
//        System.out.println("组件" + (tom01 == tom02)); //true
//
//        // 4、com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$e86fce2e@6e92c6ad
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot点会检查这个组件是否在容器中有
//        // 保持组件单实例
//        User user1 = bean.user01();
//        User user01 = bean.user01();
//        System.out.println((user01 == user1)); //true
//
//        User user = run.getBean("user01", User.class);
//        Pet pet = run.getBean("tom", Pet.class);
//
//        System.out.println("用户的宠物：" + (user.getPet() == pet));
//        System.out.println(pet);
//
//        //5、
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("=====================================");
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);

        boolean tom = run.containsBean("tom");
        System.out.println("容器中是否有tom组件:" + tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中是否有user01组件:" + user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中是否有tom22组件:" + tom22);

        boolean cat = run.containsBean("cat");
        System.out.println("容器中是否有cat组件:" + cat);

        boolean haha = run.containsBean("haha");
        System.out.println("容器中是否有haha组件:" + haha);

        boolean hehe = run.containsBean("hehe");
        System.out.println("容器中是否有hehe组件:" + hehe);

        boolean hehe1 = run.containsBeanDefinition("hehe");
        System.out.println("容器中是否有hehe1组件:" + hehe1);

//        boolean Test = run.c("Test");
//        System.out.println("容器中是否有Test组件:" + Test);


    }
}
