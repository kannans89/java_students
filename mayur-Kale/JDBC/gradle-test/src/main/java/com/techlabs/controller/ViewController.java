package com.techlabs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techlabs.dto.MessageDto;

@Controller
public class ViewController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public @ResponseBody String sayWelcome(HttpServletRequest req,
			HttpServletResponse resp) {
		req.getSession().setAttribute("user", "mayur");
		return "Hello World";

	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public @ResponseBody void sayBye(HttpServletRequest req,
			HttpServletResponse resp) {
		
		req.getSession().removeAttribute("user");

	}
	
	@RequestMapping(value = "/welcomeUser", method = RequestMethod.GET)
	public @ResponseBody String sayWelcomeUser(HttpServletRequest req,
			HttpServletResponse resp) {
		
		return "Hello World"+req.getSession().getAttribute("user");

	}
	@RequestMapping(value = "/wish/{name}", method = RequestMethod.GET)
	public @ResponseBody MessageDto wishWelcome(
			@PathVariable("name") String name) {
		MessageDto dto = new MessageDto();
		dto.setMsg("Spring says hello to " + name);
		return dto;

	}

}
