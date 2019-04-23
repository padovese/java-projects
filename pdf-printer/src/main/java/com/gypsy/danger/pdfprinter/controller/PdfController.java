package com.gypsy.danger.pdfprinter.controller;

import java.io.File;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdfController {

	@GetMapping("/pdf")
	public String imprimirPdf() {
	
		//first way
	    File directory = new File("./src/main/resources");
	    System.out.println(directory.isDirectory());
	    System.out.println(directory.getAbsolutePath());
	    
	    
	    //second way
	    File directory1 = new File("src/main/resources");
	    System.out.println(directory1.isDirectory());
	    System.out.println(directory1.getAbsolutePath());
	    
	    //third way
	    //URL url = getClass().getResource("/static/file.txt");
	    URL url = getClass().getResource("/static/");
	    File file = new File(url.getPath());
	    System.out.println(file.toString());
	    
		return "home";
	}
}
