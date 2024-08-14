package com.aibei.springboot.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2010-2024
 * FileName:     MyAppProperties
 * Author:       shine
 * Date:         2024/8/14 15:37
 * Description:
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@Data
@ToString
@Configuration
@ConfigurationProperties(prefix = "my.app")
@EnableConfigurationProperties(MyAppProperties.class)
public class MyAppProperties {
	private String name;
	private String version;
}
