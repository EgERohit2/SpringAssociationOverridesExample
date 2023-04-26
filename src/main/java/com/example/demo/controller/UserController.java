package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/postuser")
	public String postData(@RequestBody User user) {
		this.userService.postData(user);
		return "posted";
	}
	
	@GetMapping("/user")
	public List<User> getData() {
		return this.userService.getAllData();
	}
}
