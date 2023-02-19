package com.samiulalomsium.springbootblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2BlogApplication {

	//https://blackrockdigital.github.io/startbootstrap-blog-post/

	public static void main(String[] args) {
		System.setProperty("es.set.netty.runtime.available.processors", "false");
		SpringApplication.run(SpringBoot2BlogApplication.class, args);
	}
}
