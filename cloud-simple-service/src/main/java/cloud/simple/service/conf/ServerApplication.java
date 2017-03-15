/*
 * Copyright 2012-2020 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * @author lzhoumail@126.com/zhouli
 * Git http://git.oschina.net/zhou666/spring-cloud-7simple
 */

package cloud.simple.service.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动并注册 应用
 * 
 * @author 作者：刘杰
 *
 * @version 创建时间：2016年12月7日 下午5:15:40
 */
@SpringBootApplication
@EnableEurekaClient // 配置本应用将使用服务注册和服务发现，注意：注册和发现用这一个注解
@EnableCircuitBreaker
@EnableFeignClients
public class ServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServerApplication.class, args);
	}
}
