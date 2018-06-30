package com.thevoid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.thevoid")
public class ThevoidApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThevoidApplication.class, args);
	}
}
