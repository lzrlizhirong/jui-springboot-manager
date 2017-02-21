package com.roncoo.jui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author wujing
 */
@EnableAsync
@EnableScheduling
@ServletComponentScan
@SpringBootApplication
public class RoncooJuiSpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoncooJuiSpringbootWebApplication.class, args);
	}

}
