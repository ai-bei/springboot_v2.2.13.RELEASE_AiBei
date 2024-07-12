package com.aibei.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2010-2024
 * FileName:     SpringbootAIBeiTestApplications
 * Author:       shine
 * Date:         2024/4/5 10:32
 * Description:
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
/*标注这个注解的类，说明这个类是Springboot项目的主配置类*/
@SpringBootApplication
public class SpringbootAIBeiTestApplication {
	public static void main(String[] args) {
		// 执行了两件事:1.创建Spring容器 2.启动Spring容器
		SpringApplication.run(SpringbootAIBeiTestApplication.class, args);
	}
}
