package com.yuetsao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用来测试的controller
 * @author caoyue
 */
@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("源码环境构建成功...");
		return "源码环境构建成功...";
	}
}
