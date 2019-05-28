package day2.exceptions;

public class LowBalanceException extends Exception {

	private static final long serialVersionUID = 1L;


	public LowBalanceException() {
		
	}
	
	public LowBalanceException(String message) {
		super(message);
	}
	
	
	@Override
	public String toString() {
		
		return "Exception Occurred : "+this.getClass().getName();
	}
}
