package com.interest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.interest.entities.SBAccount;

class SBAccountTest {
	SBAccount sbAccount = new SBAccount();
	@Test
	public void getSetAmountTest() {
		sbAccount.setAmount(10000.0);
		assertEquals(10000.0, sbAccount.getAmount());
	}
	
	public void getSetInterestTest() {
		sbAccount.setInterestRate(5);
		assertEquals(5, sbAccount.getInterestRate());
	}
	
	public void calculateInterestTest() {
		sbAccount.setAmount(10000.0);
		assertEquals(400.0, sbAccount.calculateInterest());
	}
}
