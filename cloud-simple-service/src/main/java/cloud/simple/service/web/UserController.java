package cloud.simple.service.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cloud.simple.service.domain.UserService;
import cloud.simple.service.model.User;

/**
 * 一个使用mybatis的数据库应用，服务端
 * 
 * @author 作者：刘杰
 *
 * @version 创建时间：2016年12月1日 下午2:12:48
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> readUserInfo() {
		List<User> ls = userService.searchAll();
		return ls;
	}
}
