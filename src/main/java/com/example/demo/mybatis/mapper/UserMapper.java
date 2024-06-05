package com.example.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.mybatis.entity.User;

@Mapper
public interface UserMapper {

    User selectById(String id);

	List<User> selectAll();
}