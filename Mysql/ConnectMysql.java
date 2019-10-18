package bit.org.Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMysql {
	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/webo?serverTimezone=GMT";
	private String userName="root";
	private String password="qinjinmei";
	Connection conn=null;
	public ConnectMysql() {
		try {
			//加载驱动
			Class.forName(driver);
			//与数据库建立连接
			conn=DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	//查找
	public ResultSet Query(String sql) {
		ResultSet rs=null;
		try {
			Statement st=conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
			rs=st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	//增删改
	public int Update(String sql) {
		int result=0;
		Statement st;
		try {
			st = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
			result=st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
