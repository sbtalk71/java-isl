package day1.interfaces;

public class ConnFactory {

	public static MyConnection getConnection(String db) {
		if(db.equals("oracle")) {
			return new OracleDB();
		}if(db.equals("mysql")) {
			return new MySqlDB();
		}else {
			throw new RuntimeException("DB Not Found..");
		}
	}
}
