package com.java.service;

import java.util.List;

import com.java.pojo.User;

public interface UserService {
	public void addUser(User user);
	public List<User> findUser();
}	
