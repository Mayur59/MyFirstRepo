package com.factory;

import com.bank.Bank;
import com.loan.Loan;

public abstract class AbstractFactory {

	 public abstract Bank getBank(String bank);
	 public abstract Loan getLoan(String loan);
	 
	 static int multiply(int a, int b){  // static method    
	        return a*b;    
	    }    
}
