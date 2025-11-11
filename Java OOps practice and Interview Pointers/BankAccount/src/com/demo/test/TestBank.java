package com.demo.test;
import java.util.Scanner;

import com.demo.service.BankService;

public class TestBank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankService ss=new BankService();
		int choice;
        do {
            System.out.println("\n========= BANK MENU =========");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice)
            {
            case 1:
            	System.out.println("Enter name");
            	String name=sc.next();
            	sc.nextLine();
            	System.out.println("Enter account Number");
            	int accountnumber=sc.nextInt();
            	System.out.println("Enter initial balance");
            	double balance= sc.nextDouble();
               ss.addAccount(accountnumber, name, balance);
            	break;  
            	
            case 2:
           
            		ss.displayAll();
            		break;
            		
            case 3:
            		
            			System.out.println("Enter account number");
            			int accountnumber1=sc.nextInt();
            			System.out.println("Enter deposit amount");
            			double amount=sc.nextDouble();
            			ss.deposit(accountnumber1, amount);
            			break;
            			
            case 4:
            	System.out.println("Enter account number");
    			int accountnumber11=sc.nextInt();
    			System.out.println("Enter deposit amount");
    			double amount1=sc.nextDouble();
    			ss.withdraw(accountnumber11, amount1);
    			break;
            	
            				
        
            			
            		
            }
		
		

	}while(choice!=5);
	}

}
