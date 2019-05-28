package day2.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDemo2 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		
		PreparedStatement pst=
				conn.prepareStatement("insert into emp(empid,name,city,salary) values(?,?,?,?)");
		pst.setInt(1, 102);
		pst.setString(2, "Amit");
		pst.setString(3, "Gurgaon");
		pst.setDouble(4, 67000);
		
		int i=pst.executeUpdate();
		
		System.out.println("rows updated = "+i);
	}

}
