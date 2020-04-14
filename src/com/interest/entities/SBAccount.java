package com.interest.entities;

public class SBAccount extends Account {
	private double interestRate;
	private double amount;
	private String accountType;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		amount = getAmount();
		interestRate = getInterestRate();
		double interest = 0;


		if (getAccountType().equals("Normal")) {
			setInterestRate(0.04);
		} else if (getAccountType().contentEquals("NRI")) {
			setInterestRate(0.06);
		} else {
			System.out.println("INVALID OR UNKNOWN ACCOUNT TYPE");
		}

		interest = amount * interestRate;
		return interest;
	}

	
}
