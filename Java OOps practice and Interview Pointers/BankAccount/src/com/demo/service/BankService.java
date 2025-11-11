package com.demo.service;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.*;

public class BankService {
	private List<BankAccDetails> accountList= new ArrayList<>();
	
	public void addAccount(int accountNumber, String name, double balance)
	{
		BankAccDetails bb=new BankAccDetails();
		accountList.add(bb);
		System.out.println("Account added successFully for" +name);
		
	}
	public void displayAll()
	{
		if(accountList.isEmpty())
		{
			System.out.println("No accounts available");
			return;
	     }
		for(BankAccDetails bb: accountList)
		{
			bb.displayAccountinfo();
		}
	}
	public void deposit(int accountNumber,double amount)
	{
		BankAccDetails bc= findAccount(accountNumber);
		if(bc!=null)
		{
			bc.deposit();
		}else
		{
			System.out.println("Account not found");
		}
	}
	public BankAccDetails findAccount(int accountNumber) {
		for(BankAccDetails bc:accountList)
		{
			if(bc.getAccountNumber()==accountNumber)
			{
				return bc;
			}
		}
		return null;
	
	}
	public void withdraw(int accountNumber, double amount)
	{
		BankAccDetails bc=findAccount(accountNumber);
		if(bc!=null)
		{
			bc.withDraw(amount);
		}
		else
		{
			System.out.println("Account not found");
		}
	}

}
