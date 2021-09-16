package com.loan;

public abstract class Loan {

	protected  double rate;
	
	public abstract  void getInterestRate(double rate) ;
	public  void calculateLoanPayment(double loanAmount, int years) {
		
		 double EMI;  
		 
		 EMI= rate /100 * years * loanAmount;
		 System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanAmount+" you have borrowed");     
	}
}
