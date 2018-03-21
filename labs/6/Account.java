//package Lab6;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date(118, 2, 2, 0, 0);
	
	Account(){};
	
	Account (int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate/100;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public double getBalance() {
		return balance;
	}
		
	public void setBalance(double i) {
		balance = i;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
		
	public void setAnnualInterestRate(double i) {
		annualInterestRate = i/100;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annualInterestRate/12;
		return monthlyInterestRate;
	}
	
	public void withdraw (double i) {
		balance -= i;
	}
	
	public void deposit (double i) {
		balance += i;
	}
	
	/*
	UML
	Class: Account
	
	Data Fields: 
	id: int
	balance: double
	annualInterestRate: double
	dateCreated: date
	
	Methods 
	getId()
	setId (int)
	getBalance()
	setBalance(double)
	getAnnualInterestRate()
	setAnnualInterestRate(double)
	getDateCreated()
	getMonthlyInterestRate()
	*/
	
	public static void main (String[] args) {
		Account nam = new Account(1122, 200000, 4.5);
		nam.withdraw(2500);
		nam.deposit(3000);
		System.out.println("Balance: " + nam.getBalance());
		System.out.println("Monthly interest rate: " + nam.getMonthlyInterestRate());
		System.out.println("Date created: " + nam.getDateCreated());
	}
}
