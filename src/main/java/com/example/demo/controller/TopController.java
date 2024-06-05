package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.mybatis.entity.User;
import com.example.demo.service.UserService;

@Controller
public class TopController {
	
	@Autowired
    private UserService userService;

	@GetMapping("/top")
	public String get(Model model) {
		
		String id = (String)model.getAttribute("id");
		
		User user = userService.getLoginUser(id);
		model.addAttribute("loginUser", user);
		
		List<User> list = userService.getAllUsers();
		model.addAttribute("userList", list);
		
		return "top";
	}
}
