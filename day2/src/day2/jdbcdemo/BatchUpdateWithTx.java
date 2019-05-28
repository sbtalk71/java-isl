package day2.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdateWithTx {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);
			stmt.addBatch("insert into emp(empid,name,city,salary) values (108,'Kamal','Hyderabad',66000)");
			stmt.addBatch("insert into emp(empid,name,city,salary) values (109,'Chetan','Hyderabad',66000)");
			stmt.addBatch("insert into emp(empid,name,city,salary) values (107,'Scott','Hyderabad',66000)");

			int[] rows = stmt.executeBatch();
			conn.commit();
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.setAutoCommit(true);
		}
	}

}
