package com.java.action;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.java.pojo.User;
import com.java.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
public class UserAction  extends ActionSupport{
	private User user;//封装表单数据
	private UserService userService;//要注入服务层的对象	
	private List<User> userList;
	
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String saveUser(){
		this.userService.addUser(user);
		this.userList=this.userService.findUser();
		return SUCCESS;
	}
}
