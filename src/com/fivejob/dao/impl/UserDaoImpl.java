package com.fivejob.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.fivejob.dao.UserDao;
import com.fivejob.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public User findById(int id) {
		return getHibernateTemplate().get(User.class, id);
	}

	@Override
	public List<User> findAll() {
		return getHibernateTemplate().loadAll(User.class);
	}

	@Override
	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	@Override
	public List<User> findByHql(String hql,Object[] values) {
		return (List<User>)getHibernateTemplate().find(hql, values);
	}

}
