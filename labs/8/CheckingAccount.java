package Lab8;

public class CheckingAccount extends Account {
	private double limit;
	
	public CheckingAccount() {
		super();
		limit = -20;
	}

	public CheckingAccount(int id, double balance, double limit) {
		super(id, balance);
		this.limit = limit;
	}

	public void setlimit(double limit) {
		this.limit = limit;
	}

	public double getlimit() {
		return limit;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > limit) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Error! Amount exceeds overdraft limit.");
		}
	}

	
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + String.format("%.2f", limit);
	}
}

