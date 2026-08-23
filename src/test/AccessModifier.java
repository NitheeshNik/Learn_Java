package test;


public class AccessModifier {
	public static void main(String[] args) {
		BankAccount Account = new BankAccount();
		Account.deposit(143);
		System.out.println("Account Balance is:" + Account.checkBalance());
	}
	
}

