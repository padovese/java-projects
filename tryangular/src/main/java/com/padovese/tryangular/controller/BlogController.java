package com.padovese.tryangular.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.padovese.tryangular.model.Blog;

@RestController
public class BlogController {

	@GetMapping("/blogs")
	public ArrayList<Blog> getBlogs(){
		return data();
	}
	
	@GetMapping("/blog/{id}")
	public Blog getBlogById(@PathVariable("id") int id) {
		for(Blog blog : data()) {
			if(id == blog.getId()) {
				return blog;
			}
		}
		return null;
	}
	
	public static ArrayList<Blog> data(){
		ArrayList<Blog> list = new ArrayList<Blog>();
		list.add(new Blog(1, "Earth blog", LocalDate.of(2002, 12, 05), "This blog is about the life on earth"));
		list.add(new Blog(2, "Padova blog", LocalDate.of(1991, 04, 26), "This blog is about Padovese"));
		list.add(new Blog(3, "Fire blog", LocalDate.of(1986, 04, 26), "This blog is about how to make fire"));
		return list;
	}
}
