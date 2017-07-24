package com.fivejob.dao;

import java.util.List;

import com.fivejob.entity.User;

public interface UserDao {

    User findById(int id);
    
    List<User> findByHql(String hql,Object[] values);
	
    List<User> findAll();
    
    void save(User user);
    
    void delete(User user);
    
    void update(User user);
}
