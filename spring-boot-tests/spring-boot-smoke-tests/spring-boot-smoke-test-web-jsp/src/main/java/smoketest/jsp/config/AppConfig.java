package smoketest.jsp.config;

import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import smoketest.jsp.service.OrderService;
import smoketest.jsp.service.UserService;

/**
 * @author ADun
 * @date 2022/8/5 14:12
 */
@Configuration
public class AppConfig {

	@Bean
	//(1)判断IOC中是否存在对应的Bean
	//@ConditionalOnBean(value = UserService.class)

	//(2)判断IOC中不存在对应的Bean,一般不传参数,底层会根据方法返回值获取对应的类型
	@ConditionalOnMissingBean
	//(7)判断java版本
	//@ConditionalOnJava(value = JavaVersion.EIGHT)

	//(8)JNDI指定的资源是否存在
	//@ConditionalOnJndi()

	//(9)当前应用是一个web应用
	//@ConditionalOnWebApplication

	//(10)当前应用不是一个web应用
	//@ConditionalOnNotWebApplication

	//(11)yml或properties中存在对应的key，IOC注册相应的bean
	//@ConditionalOnProperty(value = "test.condition11",matchIfMissing = true)

	//(12)存在对应的resource，ICO注册相应的bean
	//@ConditionalOnResource(resources = "https://www.baidu.com")

	//(13)当用war进行部署时,ICO注册相应的bean
	//@ConditionalOnWarDeployment

	//(14)判断是否在某个云平台上运行
	//@ConditionalOnCloudPlatform(value = CloudPlatform.KUBERNETES)
	public OrderService orderService() {
		return new OrderService();
	}
}
