package bit.org.Mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Mysql {
	public static void main(String[] args) {
		String sql="select *from student";
		ConnectMysql cc=new ConnectMysql();
		ResultSet rs=cc.Query(sql);
		ArrayList<Student> list=new ArrayList();
		try {
			while(rs.next()) {
				Student ss=new Student();
				ss.setName(rs.getString("name"));
				ss.setSno(rs.getInt("sno"));
				ss.setAge(rs.getInt("age"));
				ss.setMajor(rs.getString("major"));
				list.add(ss);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(int i=0;i<list.size();i++)
		{
			Student obj=(Student)list.get(i);
			System.out.println("姓名:"+obj.getName()+"---"+"学号:"+obj.getSno()+"----"+"年龄:"+obj.getAge()+"----"+"专业:"+obj.getMajor());
		}
	}
}
