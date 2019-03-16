package com.gbn.common.datasource;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {

	public Connection getConnection() {
		Connection con = null;
		try {
			Properties prop = new Properties();
			prop.load(new FileReader("H:/training/ServletJDBCApp/datasource.properties"));

			String driver = prop.getProperty("driverClass");
			String url = prop.getProperty("url");
			String userName = prop.getProperty("username");
			String password = prop.getProperty("password");

			Class.forName(driver);
			con = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	/*public static void main(String[] args) {
		getConnection();
	}*/
}
