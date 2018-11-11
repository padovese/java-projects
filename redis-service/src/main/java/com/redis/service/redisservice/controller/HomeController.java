package com.redis.service.redisservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import redis.clients.jedis.Jedis;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println("homeController");
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
}
