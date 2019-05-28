package day2.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryDemo {

	public static void main(String[] args) throws Exception{
		
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		
		PreparedStatement pst=
				conn.prepareStatement("select * from emp");
		
		ResultSet rs=pst.executeQuery();
		
		if(rs!=null) {
			while(rs.next()) {
				String empData=rs.getInt("EMPID")+" "+rs.getString("NAME")+
						" "+rs.getString("CITY")+" "+rs.getDouble("SALARY");
				
				System.out.println(empData);
			}
		}
		
	}

}
