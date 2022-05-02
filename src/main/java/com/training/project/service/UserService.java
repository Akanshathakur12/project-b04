package com.training.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.project.model.User;
import com.training.project.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User login(String username, String password) {
		User user =repo.findByUsernameAndPassword(username,password);
		return user;
	}

}
