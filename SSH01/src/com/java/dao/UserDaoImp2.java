package com.java.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.java.pojo.User;
@Repository
//第二种方法   底层使用sessionFactory,自动注入模板HibernateTemplate
public class UserDaoImp2 extends HibernateDaoSupport implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("数据库层级添加");
		this.getHibernateTemplate().save(user);

	}

	@Override
	public void update(User user) {
		this.getHibernateTemplate().update(user);

	}

	@Override
	public void delete(Serializable id) {
		this.getHibernateTemplate().delete(findById(id));

	}

	@Override
	public User findById(Serializable id) {
		return this.getHibernateTemplate().get(User.class, id);

	}

	@Override
	public List<User> findAll() {
		return (List<User>) this.getHibernateTemplate().find("from User", null);
	}

}
