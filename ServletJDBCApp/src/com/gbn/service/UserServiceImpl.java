package com.gbn.service;

import java.util.List;

import com.gbn.dao.UserDao;
import com.gbn.dao.UserDaoImpl;
import com.gbn.model.User;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	@Override
	public String insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

}
