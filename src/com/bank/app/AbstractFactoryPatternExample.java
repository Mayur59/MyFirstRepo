package com.bank.app;

import java.util.Scanner;

import com.bank.Bank;
import com.factory.AbstractFactory;
import com.factory.CreaterFactory;
import com.loan.Loan;

public class AbstractFactoryPatternExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the name of Bank from where you want to take loan amount: ");  
	      String bankName=sc.nextLine();  
	      
	      System.out.print("\n");  
	      System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : "); 
	      
	      String loanName=sc.nextLine();  
	      
	      AbstractFactory bankFactory = CreaterFactory.getFactory("Bank");  
	      Bank b=bankFactory.getBank(bankName);  
	      
	      System.out.print("\n");  
	      System.out.print("Enter the interest rate for "+b.getBankName()+ ": ");
	      
	      double rate=Double.parseDouble(sc.nextLine());  
	      System.out.print("\n");  
	      System.out.print("Enter the loan amount you want to take: ");  
	        
	      double loanAmount=Double.parseDouble(sc.nextLine());  
	      System.out.print("\n");  
	      System.out.print("Enter the number of years to pay your entire loan amount: ");  
	      int years=Integer.parseInt(sc.nextLine());  
	        
	      System.out.print("\n");  
	      System.out.println("you are taking the loan from "+ b.getBankName());  
	        
	      
	      AbstractFactory loanFactory = CreaterFactory.getFactory("Loan");  
          Loan l=loanFactory.getLoan(loanName);  
          l.getInterestRate(rate);  
          l.calculateLoanPayment(loanAmount,years);  
		

	}

}
