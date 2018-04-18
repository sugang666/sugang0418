package com.java.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.UserDao;
import com.java.pojo.User;
import com.java.utils.MD5;
@Service
public class UserServiceImp  implements UserService{
	@Resource
	private UserDao  userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user){
		String password = user.getPassword();
		user.setPassword(MD5.encryption(password));
		System.out.println("服务层代码调数据访问层代码");
		this.userDao.save(user);
	}

	@Override
	public List<User> findUser() {
		return this.userDao.findAll();
	}

}
