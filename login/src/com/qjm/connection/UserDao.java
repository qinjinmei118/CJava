package com.qjm.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	private DBUtil db;
	
	public boolean findUser(String userName,String userPassword) {
		boolean flag=false;
		Connection conn=db.getConnection();
		String sql = "select * from login where name='"+userName+"' and password='"+userPassword+"'";
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next()) {
				System.out.print("�ҵ���");
				flag=true;
			}
			else {
				flag=false;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		return flag;
	}

}
