package cloud.simple.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * docker是一种虚拟技术，可以同时让应用的部署，测试，分发都变得前所未有的高效和轻松
 * 
 * @author 作者：刘杰
 *
 * @version 创建时间：2016年12月2日 下午4:52:32
 */
@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
}