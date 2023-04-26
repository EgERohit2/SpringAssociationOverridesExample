package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllData() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void postData(User user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
		
	}
}
