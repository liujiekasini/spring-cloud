package cloud.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot本身提供的restful服务作为服务与服务之间的调用，效率低很多，thrift的效率大概是restful的100-1000倍左右。
 * 本篇既是基于spring boot框架，结合thrift和zookeeper实现的一个简单微服务框架，服务与服务之间使用thrift通信
 * 
 * 服务提供方
 * 
 * @author 作者：刘杰
 *
 * @version 创建时间：2016年12月2日 下午4:56:34
 */
@SpringBootApplication
public class CloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServerApplication.class, args);
	}
}
