package com.factory;

import com.bank.Bank;
import com.bank.HDFC;
import com.bank.SBI;
import com.loan.Loan;

public class BankFactory extends AbstractFactory {

	@Override
	public
	Bank getBank(String bank) {
		
		if(bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}
		else if(bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		
		return null;
	}

	@Override
	public
	Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
