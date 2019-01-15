package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {
	int rollNo;
	
	@RequestMapping(value="/index")
	public String getIndexPage() {
		return "index";
	}
}
