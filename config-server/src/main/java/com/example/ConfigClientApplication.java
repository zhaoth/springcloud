package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

//http://localhost:7001/config/prod/config-label-test
//URL与配置文件的映射关系如下：
//
//		/{application}/{profile}[/{label}]
//		/{application}-{profile}.yml
//		/{label}/{application}-{profile}.yml
//		/{application}-{profile}.properties
//		/{label}/{application}-{profile}.properties
@EnableDiscoveryClient
@EnableConfigServer//开启Config Server
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
