package com.us.improve.registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName RegisterCenterApplication
 * @Desciption RegisterCenter服务启动入口
 * @Author loren
 * @Date 2019/1/4 8:39 PM
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterCenterApplication.class, args);
	}

}

