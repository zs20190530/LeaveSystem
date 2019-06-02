package org.ls.controller;

import org.ls.entity.User;
import org.ls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"/login", "/"})
	public String getLoginForm(Model model) {
		return "loginForm";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user, WebRequest webRequest, Model model) {
		User userResult = userService.login(user);
		if (userResult!=null) {
			webRequest.setAttribute("username", userResult.getUsername(), WebRequest.SCOPE_SESSION);
			return "redirect:/leaveManagement";
		}
		model.addAttribute("message", "用户名或密码错误。");
		return "loginForm";
	}
}
