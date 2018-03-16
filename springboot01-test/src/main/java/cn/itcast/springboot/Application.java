package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的引导类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年3月7日 下午3:17:05
 * @version 1.0
 */
@SpringBootApplication( // 引导类，SpringBoot应用运行的主类
		scanBasePackages={"cn.itcast.springboot"}) // 指定扫描的基础包
public class Application {

	public static void main(String[] args) {
		/** 第一种方式：运行SpringBoot的应用 */
		//SpringApplication.run(Application.class, args);
		
		/** 第二种方式：运行SpringBoot的应用 (去掉banner) */
		/** 创建SpringApplication对象 */
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		/** 设置关闭Banner */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}