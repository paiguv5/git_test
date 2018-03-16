package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.service.UserService;

/**
 * 控制器
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年3月7日 下午3:26:46
 * @version 1.0
 */
@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;
	/** 一次性全部注入 */
	@Autowired
	private Environment environment;
	/** 单个属性注入 */
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	@GetMapping("/hello")
	public String hello(){
		System.out.println("name: " + environment.getProperty("name"));
		System.out.println("url: " + environment.getProperty("url"));
		System.out.println(name + "=====>" + url);
		userService.say();
		return "Hello Spring Boot!";
	}
}
