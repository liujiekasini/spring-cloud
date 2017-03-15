/*
 * Copyright 2012-2020 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * @author lzhoumail@126.com/zhouli
 * Git http://git.oschina.net/zhou666/spring-cloud-7simple
 */

package cloud.simple.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cloud.simple.model.User;
import cloud.simple.service.FeignUserService;
import cloud.simple.service.UserService;

/**
 * web ui客户端 在spring boot中已经不推荐使用jsp 所以你如果使用webui端，会很麻烦，这可能跟现在开发主流偏重移动端有关，
 * 跟微服务有关，根整个时代当前的技术需求有关，单纯以html做为客户端，有很多好处，你如便于告诉缓存，是后台服务无状态话，
 * 更利于处理高并发，更利于页面做为服务，小服务组合成大服务等 一个页面可能调用多个服务，这些服务可能涉及到事物和并发问题，
 * 
 * @author 作者：刘杰
 *
 * @version 创建时间：2016年12月1日 下午2:22:03
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	FeignUserService feignUserService;

	@RequestMapping(value = "/users")
	public ResponseEntity<List<User>> readUserInfo() {
		List<User> users = userService.readUserInfo();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
}
