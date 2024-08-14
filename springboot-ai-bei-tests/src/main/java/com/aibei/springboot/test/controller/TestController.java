package com.aibei.springboot.test.controller;

import com.aibei.springboot.config.MyAppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2010-2024
 * FileName:     TestController
 * Author:       shine
 * Date:         2024/4/5 10:29
 * Description:
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@RestController
public class TestController {

	@Autowired
	MyAppProperties myAppProperties;

	@GetMapping("/test")
	public String test(){
		System.out.println(myAppProperties);
		return "Success";
	}
}
