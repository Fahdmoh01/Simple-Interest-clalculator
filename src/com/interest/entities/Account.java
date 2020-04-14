package com.interest.entities;

public abstract class Account {
	private double interestRate;
	private double amount;

	abstract double calculateInterest();

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
}
