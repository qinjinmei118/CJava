package bits.org.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DB_Pool {
	// 声明 一个容器
	private static List<Connection> pool = new ArrayList<Connection>();
	private static String url = "jdbc:mysql://localhost:3306/webo?serverTimezone=GMT";
	private static String user = "root";
	private static String password = "qinjinmei";
	public DB_Pool() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			for(int i=0;i<10;i++) {
				conn=DriverManager.getConnection(url,user,password);
				pool.add(conn);
			
			} 
			System.err.println("连接是："+pool);
			
			}catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	public Connection getcon() {
		synchronized (pool) {
			Connection conn=pool.remove(0);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.err.println("还有："+pool.size());
			if(pool.size()<=0) {
				System.err.println("无");
				conn=null;
			}
			return conn;
		}
		
	}
	public static void back(Connection conn) {
		System.out.print("还连接:"+conn);
		pool.add(conn);
	}
}
