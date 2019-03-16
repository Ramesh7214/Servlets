package com.gbn.dao;
import java.util.List;

import com.gbn.model.User;

public interface UserDao {
	
	public String insertUser(User user);
	public List<User> getUsers();

}
