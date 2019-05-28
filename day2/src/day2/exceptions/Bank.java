package day2.exceptions;

public class Bank {
	private double balance = 1000;

	public double withdraw(double amount) throws LowBalanceException {
		try {
			if (amount < balance) {
				System.out.println("Transaction done...");
				balance = balance - amount;
				return balance;
			} else {
				System.out.println("Transaction could not be processed");
				throw new LowBalanceException();
			}
		} catch (LowBalanceException e) {
			e.printStackTrace();
			throw e;
		}
		//return balance;
	}
}
