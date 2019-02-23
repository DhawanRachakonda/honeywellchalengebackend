package com.stockticker.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.stockticker.repositories.UserRepository;

public class UserDataAccess implements DataAccess {

	private final UserRepository userRepository;
	
	@Autowired
	public UserDataAccess(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
