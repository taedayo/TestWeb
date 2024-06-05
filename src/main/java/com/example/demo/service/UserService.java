package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mybatis.entity.User;
import com.example.demo.mybatis.mapper.UserMapper;

@Service
public class UserService {
	
    @Autowired
    private UserMapper userMapper;

    public User getLoginUser(String id) {
    	User user = userMapper.selectById(id);
    	return user;
    }
    
    public List<User> getAllUsers() {
    	List<User> list = userMapper.selectAll();
    	return list;
    }
    

}