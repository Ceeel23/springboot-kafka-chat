package com.ceeel.springbootkafkachat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ceeel")
public class SpringbootKafkaChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaChatApplication.class, args);
	}

}
