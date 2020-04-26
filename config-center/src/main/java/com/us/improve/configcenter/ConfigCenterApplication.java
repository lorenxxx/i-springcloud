package com.us.improve.configcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigCenterApplication
 * @Desciption ConfigCenter服务启动入口
 * @Author loren
 * @Date 2019/1/4 8:39 PM
 * @Version 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterApplication.class, args);
	}

}

