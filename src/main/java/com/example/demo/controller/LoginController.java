package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.form.LoginForm;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String get(Model model, LoginForm form) {
		model.addAttribute("message", "テストメッセージ");
		
		form.setLabel("テストラベル");
		return "login";
	}
	
	@PostMapping("/login")
	public String post(LoginForm form, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("id", form.getId());
		return "redirect:/top";
	}
}
