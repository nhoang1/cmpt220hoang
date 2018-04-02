package Lab8;

public class SavingsAccount extends Account {
	public SavingsAccount() {
		super();
	}

	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Error! SavingsAccount account overdrawn transtaction rejected");
		}
	}	
}

