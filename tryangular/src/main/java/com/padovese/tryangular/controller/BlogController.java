package com.padovese.tryangular.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.padovese.tryangular.model.Blog;

@RestController
public class BlogController {

	@GetMapping("/blogs")
	public ArrayList<Blog> getBlogs(){
		ArrayList<Blog> list = new ArrayList<Blog>();
		list.add(new Blog(1, "Earth blog", LocalDate.of(2002, 12, 05)));
		list.add(new Blog(2, "Padova blog", LocalDate.of(1991, 04, 26)));
		list.add(new Blog(3, "Fire blog", LocalDate.of(1986, 04, 26)));
		
		return list;
	}
}
