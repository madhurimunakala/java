package com.madhu.tmf.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/home")
	public String home() {
		System.out.println("Home Controller");
		return "user_login";
	}
}