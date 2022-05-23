package com.yuetsao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.该类只能扫描所在的包及其子包
 * 2.3 什么是springboot 的自动配置呢？根据我们添加的jar包依赖，会自动将一些配置类的bean注册进ioc 容器，我们可以需要的地方使用@Autowired 或 @Resource 等注解来使用它
 * springboot 到底是如何进行自动配置，都把那些组件进行了自动配置？
 *
 */
@SpringBootApplication//标注在类上说明这个类是springboot的主配置类
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
