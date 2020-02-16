package com.qjm.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/webo?serverTimezone=GMT";
	private String userName="??";
	private String password="???";
	
	public Connection getConnection () {
		Connection conn=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return conn;
	}
}
