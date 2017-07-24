package com.fivejob.service;

import java.util.List;

import com.fivejob.entity.User;

public interface UserService {
	
    boolean login(User user);
	
    User findById(int id);
    
    List<User> list();
    
    void add(User user);
    
    void delete(User user);
    
    void update(User user);

}
