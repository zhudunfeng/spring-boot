/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smoketest.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;

import java.util.Arrays;

@SpringBootApplication()
public class SampleWebJspApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SampleWebJspApplication.class);
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SampleWebJspApplication.class, args);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println(isContainBean("welcomeController",beanDefinitionNames));
		System.out.println(isContainBean("orderService",beanDefinitionNames));
		Resource resource = applicationContext.getResource("https://www.baidu.com");
		System.out.println(resource);

	}

	public static boolean isContainBean(String beanName,String... beanDefinitionNames){
		return Arrays.asList(beanDefinitionNames).contains(beanName);
	}

}
