package com.profile.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.profile.controller,com.profile.service,com.profile.repository", "controller", "service" })
public class MyProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProfileApplication.class, args);
	}

}
