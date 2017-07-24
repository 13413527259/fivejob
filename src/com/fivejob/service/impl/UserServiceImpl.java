package com.fivejob.service.impl;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.fivejob.dao.UserDao;
import com.fivejob.entity.User;
import com.fivejob.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean login(User user) {
		List<User> u=userDao.findByHql("from User where account=? and password=? and identity=?", new Object[]{user.getAccount(),user.getPassword(),user.getIdentity()});
		if (u.size()>0&&user.equals(u.get(0))) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> list() {
		return userDao.findAll();
	}

	@Override
	public void add(User user) {
		userDao.save(user);
//		int i=2/0;
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

}
