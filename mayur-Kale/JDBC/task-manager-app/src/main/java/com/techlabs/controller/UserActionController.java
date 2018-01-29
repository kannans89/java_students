package com.techlabs.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techlabs.entity.User;
import com.techlabs.manager.TaskManager;

@Controller
public class UserActionController {

	@Autowired
	TaskManager manager;

	@RequestMapping(value = "/user/authenticate", method = RequestMethod.GET)
	public @ResponseBody boolean login(@RequestBody User user,
			HttpServletRequest req, HttpServletResponse resp) {
		if (manager.isValidUser(user.getUserName(), user.getPassword())) {
			req.getSession().setAttribute("owner", user);
			return true;
		}
		return false;
	}
	@RequestMapping(value = "/user/allUser", method = RequestMethod.GET)
	public @ResponseBody Set<User> getAll(
			HttpServletRequest req, HttpServletResponse resp) {
		return manager.getUserList();
	}

	

	@RequestMapping(value = "/user/logout", method = RequestMethod.GET)
	public @ResponseBody void logout(@RequestBody User user,
			HttpServletRequest req, HttpServletResponse resp) {
		if (req.getSession().getAttribute("owner") != null) {
			req.getSession().removeAttribute("owner");
		}
	}

	@RequestMapping(value = "/user/changePassword", method = RequestMethod.POST)
	public @ResponseBody boolean changePassword(@RequestParam String oldPass,
			@RequestParam String newPass, HttpServletRequest req,
			HttpServletResponse resp) {
		if (req.getSession().getAttribute("owner") != null) {
			User owner = (User) req.getSession().getAttribute("owner");
			if (manager.isValidUser(owner.getUserName(), oldPass)) {
				owner.setPassword(newPass);
				manager.changePassword(owner);
				req.getSession().setAttribute("owner", owner);
				return true;
			}
		}
		return false;
	}

}
