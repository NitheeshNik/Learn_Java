package test;

public class BankAccount {
	private double balance;
	
	public void deposit(double amount) {
	 balance = balance + amount;
		
		
	}
	public double checkBalance() {
		return balance;
	}

}
