package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public Connection getConnection(String jdbcUrl, String userName,String userPwd)throws ClassNotFoundException, SQLException  {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPwd);
			Statement statement = connection.createStatement();		
	return connection;
}
}