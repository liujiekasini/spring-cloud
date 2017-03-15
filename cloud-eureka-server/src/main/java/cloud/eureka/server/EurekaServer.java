/**
 * eureka server
 * @author 52395090@qq.com
 * http://git.oschina.net/zhou666/spring-cloud-7simple
 */
package cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册服务器
 * 
 * @author 作者：刘杰
 *
 * @version 创建时间：2016年12月1日 下午2:11:46
 */
@SpringBootApplication // @Configuration、@EnableAutoConfiguration、@ComponentScan
@EnableEurekaServer // 让应用变为服务器
public class EurekaServer {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
		String errorString = "emergency! eureka may be incorrectly claiming instances are up when they're not. renewals are lesser than threshold and hence the instances are not being expired just to be safe.";
		errorString = "the self preservation mode is turned off.this may not protect instance expiry in case of network/other problems.";
	}
}
