package com.gbn.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gbn.common.datasource.DBUtil;
import com.gbn.model.User;

public class UserDaoImpl extends DBUtil implements UserDao {

	String INSERT_USER = "insert into USER1 values(?,?,?)";
	String GET_USERS = "select * from USER1";

	@Override
	public String insertUser(User user) {
		String message = null;
		int result = 0;
		try {
			PreparedStatement pst = getConnection().prepareStatement(INSERT_USER);
			pst.setString(1, user.getName());
			pst.setInt(2, user.getAge());
			pst.setString(3, user.getCity());
			result = pst.executeUpdate();
		} catch (Exception e) {

		}
		if (result == -1 || result == 0) {
			message = "No data inserted!!";
		} else {
			message = "User inserted succesfully!!";
		}

		return message;
	}

	@Override
	public List<User> getUsers() {
		ResultSet data = null;
		try {
			Statement stmt = getConnection().createStatement();
			data = stmt.executeQuery(GET_USERS);
		} catch (Exception e) {

		}
		return prepareUserList(data);
	}

	private List<User> prepareUserList(ResultSet rs) {
		ArrayList<User> userList = new ArrayList<User>();
		try {
			while (rs.next()) {
				User user = new User();
				user.setName(rs.getString(1));
				user.setAge(rs.getInt(2));
				user.setCity(rs.getString(3));
				userList.add(user);
			}
		} catch (Exception e) {

		}
		return userList;
	}
}
