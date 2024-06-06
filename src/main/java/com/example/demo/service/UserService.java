package com.example.demo.service;

import java.util.List;

import com.example.demo.mybatis.entity.User;

public interface UserService {
	
    User getLoginUser(String id);
    
    List<User> getAllUsers();
}
