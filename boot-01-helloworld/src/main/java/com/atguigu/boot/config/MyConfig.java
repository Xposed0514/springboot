package com.atguigu.boot.config;


import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @FileName：MyConfig
 * @Author：LiYan
 * @createDate：2023/1/10 19:46
 * @description： 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 * Full 全部配置(proxyBeanMethods = true)
 * Lite 轻量级配置(proxyBeanMethods = false)
 * 组件依赖
 * 4、 @Import({User.class， DBHelper.class})
 * 给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = false) //告诉springboot这是一个配置类 == 配置文件
//@ConditionalOnBean(name = "tom") //全局配置
//@ConditionalOnMissingBean(name = "tom")
/**
 * 注意 当配置在方法上的时候 和代码的执行顺序就有关系了
 * @ConditionalOnMissingBean(name = "tom")
 */
@ImportResource("classpath:beans.xml") // 导入xml配置的组件

@EnableConfigurationProperties(Car.class) // 1、开启Car的配置绑定功能  2、把Car这个组件自动注册到容器当中
public class MyConfig {

    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次，获取的都是之前注册容器中的单实例对象
     *
     * @return
     */
    @ConditionalOnBean(name = "tom") // 在容器中有某个组件，才注册本组件
    @Bean //给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public User user01() {
        User user = new User("李四", 18);
        //User组件依赖Pet组件
        user.setPet(tomcatPet1());
//        user.setName("李四");
//        user.setAge(19);
        return user;
        //        return new User("李四",18);
    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("馄饨");
    }

    @Bean("tom22")
    public Pet tomcatPet1() {
        return new Pet("馄饨");
    }
}
