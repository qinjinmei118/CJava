package bits.org.pool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class testTime {
	public static void main(String[] args) {
		long startTime1=new Date().getTime();
		DB_Pool pp=new DB_Pool();
		 Statement st;
		 String name="";
		 int sno=0;
		 int age=0;
		 String major="";
		 for(int i=0;i<5000;i++) {
				Connection conn=pp.getcon();
			try {
				st = conn.createStatement();
				String sql="select *from student";
				ResultSet rs=st.executeQuery(sql);
				while(rs.next()) {
					name=rs.getString("name");
					sno=rs.getInt("sno");
					age=rs.getInt("age");
					major=rs.getString("major");
					/* System.err.println("name:"+name+"---"+"sno:"+sno+"---"+"age:"+age+"---"+major);*/
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			 DB_Pool.back(conn);
		 }
		 long endTime1=new Date().getTime();
		 System.err.println(endTime1-startTime1);
	}
}
