package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {

	@GetMapping("/top")
	public String get(Model model) {
		model.addAttribute("id", model.getAttribute("id"));
		return "top";
	}
}
