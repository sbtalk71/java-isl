package day2.exceptions;

public class Client {

	public static void main(String[] args) throws Exception{
		Bank b= new Bank();
		b.withdraw(500);
		b.withdraw(500);
		b.withdraw(500);

	}

}
