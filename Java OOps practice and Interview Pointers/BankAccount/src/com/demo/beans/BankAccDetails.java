package com.demo.beans;

public class BankAccDetails {
	private String name;
	private int accountNumber;
	private double balance;
	
	public BankAccDetails()
	{
		name=null;
		accountNumber=0;
		balance=0;
	}
	public BankAccDetails(String name,int accountNumber, double balance) {
		this.name=name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit()
	{
		double amount=0;
		if(balance<amount)
		{
			balance+=amount;
			System.out.println("Deposited" +amount);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
	public void withDraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println("SuccessFully Withdrawal complete");
		}
		else if(amount>balance)
		{
			System.out.println("Short on funds");
		}
	}
	public void displayAccountinfo()
	{
		System.out.println("Name-->" +name);
		System.out.println("Account Number-->" +accountNumber);
		System.out.println("Initial Balance" +balance);
		
	}
	@Override
	public String toString() {
		return "BankAccDetails [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
}
