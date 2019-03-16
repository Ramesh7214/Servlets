package com.gbn.service;

import java.util.List;

import com.gbn.model.User;

public interface UserService {
	
	public String insertUser(User user);

	public List<User> getUsers();
}
