package com.java.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.java.pojo.User;

public class UserDaoImp implements UserDao {
	//spring为我们提供了Hibernate 模板对象，类似于session工厂对象，之后是由容器注入，所以提供set方法
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(User user) {
		System.out.println("数据库层级添加");
		this.hibernateTemplate.save(user);

	}

	@Override
	public void update(User user) {
		this.hibernateTemplate.update(user);

	}

	@Override
	public void delete(Serializable id) {
	this.hibernateTemplate.delete(findById(id));

	}

	@Override
	public User findById(Serializable id) {
		return this.hibernateTemplate.get(User.class, id);

	}

	@Override
	public List<User> findAll() {
		return (List<User>) this.hibernateTemplate.find("from User", null);
	}

}
