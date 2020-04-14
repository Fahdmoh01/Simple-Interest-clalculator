package com.interest.entities;

public class RDAccount extends Account {
	private double InterestRate;
	private double amount;
	private int noOfMonth;
	private double monthlyAmount;
	private int ageOfACHolder;

	@Override
	public double calculateInterest() {
		double rateOfInterest = 0;
		double interest = 0;
		if (noOfMonth == 6) {
			rateOfInterest = 7.5;
		} else if (noOfMonth == 9) {
			rateOfInterest = 7.75;
		} else if (noOfMonth == 9) {
			rateOfInterest = 7.75;
		} else if (noOfMonth == 9) {
			rateOfInterest = 7.75;
		} else if (noOfMonth == 9) {
			rateOfInterest = 7.75;
			if (ageOfACHolder >= 65) {
				rateOfInterest += 0.5;
			}
		}
		interest = amount * rateOfInterest / 100;
		return interest;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNoOfMonth() {
		return noOfMonth;
	}

	public void setNoOfMonth(int noOfMonth) {
		this.noOfMonth = noOfMonth;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

}
