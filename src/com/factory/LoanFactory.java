package com.factory;

import com.bank.Bank;
import com.loan.BussinessLoan;
import com.loan.HomeLoan;
import com.loan.Loan;

public class LoanFactory extends AbstractFactory {

	@Override
	public
	Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		if(loan.equalsIgnoreCase("HOME")) {
			return new HomeLoan();
		}
		else if(loan.equalsIgnoreCase("BUSSINESS")) {
			return new BussinessLoan();
		}
		else {
		return null;
		}
	}

}
