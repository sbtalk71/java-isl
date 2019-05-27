package day1.interfaces;

public class MySqlDB implements MyConnection{

	@Override
	public String getConnectionInfo() {
		
		return "MySQL DB Connection";
	}

	@Override
	public String getDbDetails() {
		
		return "MySQL 6.0";
	}

}
