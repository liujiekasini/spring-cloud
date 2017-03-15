package cloud.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cloud.simple.interfaces.UserDto;
import cloud.simple.interfaces.UserService;
import cloud.simple.provider.UserServiceProvider;

/**
 * 服务调用方
 * 
 * @author 作者：刘杰
 *
 * @version 创建时间：2016年12月2日 下午4:58:09
 */
@Controller
public class UserController {

	@Autowired
	UserServiceProvider userServiceProvider;

	@ResponseBody
	@RequestMapping(value = "/hello")
	String hello() throws TException {
		UserService.Client svr = userServiceProvider.getBalanceUserService();
		UserDto userDto = svr.getUser();
		return "hi " + userDto.getUsername();
	}
}
