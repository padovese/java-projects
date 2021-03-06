package com.gypsydanger.rest.webservices.restfulwebservices.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.gypsydanger.rest.webservices.restfulwebservices.model.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;

	 @GetMapping(path="/hello-world")
	 public String helloWorld() {
		 return "Hello Gypsy";
	 }
	 
	 @GetMapping("/hello-world-bean")
	 public HelloWorldBean helloWorldBean() {
		 return new HelloWorldBean("Hello World");
	 }

	 @GetMapping("/hello-world/path-variable/{name}")
	 public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		 return new HelloWorldBean(String.format("Hello there, %s", name));
	 }
	 
	 @GetMapping("/hello-world-international")
	 public String helloWorldInternationalized() {
		 return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	 }
}
