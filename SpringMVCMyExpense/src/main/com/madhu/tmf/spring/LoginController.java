package com.madhu.tmf.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

		@RequestMapping(value="/login")
		public String validateLogin(HttpServletRequest request) {
			String name=request.getParameter("user_name");
			String password = request.getParameter("pass_code");

			if(name.equals(password)) {
				return "user_home";
			}else {
				return "login";
			}
		}

	}

