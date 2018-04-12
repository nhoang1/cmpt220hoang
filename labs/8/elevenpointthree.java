//package Lab8;

public class elevenpointthree {
	
	public static void main(String[] args) {
		Account account = new Account(001, 9999);
		SavingsAccount savings = new SavingsAccount(002, 9999);
		CheckingAccount checking = new CheckingAccount (003, 9999, -20);
	
		//annual interest rate of 5%
		account.setAnnualInterestRate(5.0);
		savings.setAnnualInterestRate(5.0);
		checking.setAnnualInterestRate(5.0);

		
		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);

	
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

	
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}
