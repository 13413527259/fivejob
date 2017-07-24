package com.fivejob.action;

import com.fivejob.entity.User;
import com.fivejob.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	User user=new User();
	@Override
	public User getModel() {
		return user;
	}
	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String login() {
		if (userService.login(user)) {
			ActionContext.getContext().getSession().put("loginUser", user);
			return "success";
		}
		return "login";
	}
	public String list() {
		ActionContext.getContext().getValueStack().set("list", userService.list());;
		return "list";
	}
	public String addUI() {
		return "addUI";
	}
	public String deleteUI() {
		user=userService.findById(user.getId());
		return "deleteUI";
	}
	public String updateUI() {
		user=userService.findById(user.getId());
		return "updateUI";
	}
	public String add() {
		userService.add(user);
		return "add";
	}
	public String delete() {
		userService.delete(user);
		return "delete";
	}
	public String update() {
		userService.update(user);
		return "update";
	}
}
