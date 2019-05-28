package day2.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws Exception{
		
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		
		Statement stmt=conn.createStatement();
		int rows=stmt.executeUpdate("insert into emp(empid,name,city,salary) values (101,'Shantanu','Hyderabad',66000)");
		
		if(rows==1) {
			System.out.println("Data Inserted");
		}
	}

}
