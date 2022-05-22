package com.yuetsao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.该类只能扫描所在的包及其子包
 */
@SpringBootApplication
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
