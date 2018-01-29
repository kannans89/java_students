package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.action.form.UserForm;
import com.techlabs.entities.User;
import com.techlabs.exceptions.BankingException;
import com.techlabs.service.UserService;

public class UserAction implements ModelDriven<UserForm> {

	@Autowired
	UserService userService;

	UserForm userForm = new UserForm();

	public String login() {
		try {
			User user = userService.login(userForm.getId(), userForm.getPassword(), userForm.getUserType());
			userForm.setName(user.getName());

			switch (user.getStatus()) {
			case 'A':
				setAttribute();
				return "success" + userForm.getUserType();
			case 'I':
				setAttribute();
				return "forcePwdChange";
			case 'L':
				return "locked";
			}
		} catch (BankingException e) {
			e.getMessage();
		}
		return "error";
	}

	public String changePassword() {
		try {
			userService.changePassword(getAttribute().getId(), getAttribute().getUserType(), userForm.getPassword(),
					userForm.getNewPassword());
			return "success";
		} catch (BankingException e) {
			e.getMessage();
		}
		return "fail";
	}

	public String forgotPassword() {
		try {
			userService.forgotPassword(userForm.getId(), userForm.getUserType(), userForm.getContact().getMobile(),
					userForm.getContact().getEmail());
			return "success";
		} catch (BankingException e) {
			e.getMessage();
		}
		return "fail";
	}

	public String logout() {
		getSession().invalidate();
		return "success";
	}

	private HttpSession getSession() {
		return ServletActionContext.getRequest().getSession();
	}

	private void setAttribute() {
		userForm.setPassword(null);
		getSession().setAttribute("user", userForm);
	}

	private UserForm getAttribute() {
		return (UserForm) getSession().getAttribute("user");
	}

	public UserForm getModel() {
		return userForm;
	}

}
