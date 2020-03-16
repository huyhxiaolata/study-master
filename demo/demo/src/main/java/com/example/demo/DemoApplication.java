package com.example.demo;

import com.example.demo.bean.BlogProperties2;
import com.example.demo.bean.TestConfigBean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@EnableConfigurationProperties({TestConfigBean.class})
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		SpringApplication app=new SpringApplication(DemoApplication.class);
        /**
         *  静止修改端口
         */
//        app.setAddCommandLineProperties(false);
        /**
         *  banner 开关
         */
//		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@RequestMapping("/")
	String index() {
		return "hello spring boot";
	}
}


