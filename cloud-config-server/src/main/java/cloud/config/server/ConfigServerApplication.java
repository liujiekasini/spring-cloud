/**
 * spring cloud config server
 * @author lzhoumail@126.com 
 */
package cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * 配置文件服务器 读取git上cloud-config-repo文件下面俩个配置文件： cloud-config-dev.properties
 * 对应开发环境配置信息 主要是mysql cloud-config-test.properties 对应测试环境配置信息
 * 
 * @author 作者：刘杰
 *
 * @version 创建时间：2016年12月1日 下午2:18:09
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
