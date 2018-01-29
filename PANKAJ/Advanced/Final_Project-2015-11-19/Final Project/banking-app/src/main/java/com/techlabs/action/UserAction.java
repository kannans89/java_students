package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.action.form.UserForm;
import com.techlabs.exceptions.BankingException;
import com.techlabs.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<UserForm> {

	private static final long serialVersionUID = 1L;

	@Autowired
	UserService userService;

	UserForm userForm = new UserForm();

	public String login() {
		try {
			char userStatus = userService.login(userForm.getId(), userForm.getPassword(), userForm.getUserType());

			switch (userStatus) {
			case 'A':
				setAttribute();
				return "success" + userForm.getUserType();
			case 'I':
				setAttribute();
				return "forcePwdChange";
			default:
				return "locked";
			}
		} catch (BankingException e) {
			addActionError(e.getMessage());
			return "input";
		}
	}

	public String changePassword() {
		try {
			userService.changePassword(getAttribute().getId(), getAttribute().getUserType(), userForm.getPassword(),
					userForm.getNewPassword());
			return "success";
		} catch (BankingException e) {
			addActionError(e.getMessage());
			return "input";
		}
	}

	public String forgotPassword() {
		try {
			userService.resetPassword(userForm.getId(), userForm.getUserType(), userForm.getContact().getMobile(),
					userForm.getContact().getEmail());
			return "success";
		} catch (BankingException e) {
			addActionError(e.getMessage());
			return "input";
		}
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
