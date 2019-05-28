package day1.interfaces;

public class IntfMain {

	public static void main(String[] args) {
		MyConnection conn=ConnFactory.getConnection("oracle");
		
		System.out.println(conn.getConnectionInfo());
		System.out.println(conn.getDbDetails());

	}
	
	

}
