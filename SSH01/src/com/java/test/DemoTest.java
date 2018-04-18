package com.java.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.pojo.User;
import com.java.service.UserService;

public class DemoTest {
	@Test
	public void test(){
		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService  us = (UserService) context.getBean("userService");
		us.addUser(new User(0, "sugang", "sugang"));
	}
}
