package day1.interfaces;

public class OracleDB implements MyConnection{

	@Override
	public String getConnectionInfo() {
		
		return "Oracle DB Connection";
	}

	@Override
	public String getDbDetails() {
		
		return "Oracle 12c";
	}

}
