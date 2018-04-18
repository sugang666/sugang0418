package com.java.dao;

import java.io.Serializable;
import java.util.List;

import com.java.pojo.User;

public interface UserDao {
	public void save(User user);
	public void update(User user);
	public void delete(Serializable id);
	public User findById(Serializable id);
	public List<User> findAll();
}	
