package com.interest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.interest.entities.FDAccount;

class FDAccountTest {
	private FDAccount fdAccount = new FDAccount();

	@Test
	//AmountSet Test
	public void setAmounTest() {
		fdAccount.setAmount(10000.0);
		assertEquals(10000.0, fdAccount.getAmount(),0.0);
	}
	//interestTest
	public void getSetInterestTest() {
		fdAccount.setInterestRate(5);
		assertEquals(5, fdAccount.getInterestRate(),0);
		
	}
	//daysTest
	public void getSetNoOfDaysTest() {
		fdAccount.setNoOfDays(95);
		assertEquals(95, fdAccount.getNoOfDays());
		
	}
	//AgeacHolderTest
	public void getSetAgeofACHolderTest() {
		fdAccount.setAgeOfACHolder(8);
		assertEquals(8, fdAccount.getAgeOfACHolder());
		
	}
	
	//CalculateInterestTest
	public void calculateInterestTest() {
		fdAccount.setAmount(10000.0);
		fdAccount.setNoOfDays(91);
		fdAccount.setAgeOfACHolder(65);
		assertEquals(800.0, fdAccount.calculateInterest(), 0.0);
		
		fdAccount.setAmount(10000.0);
		fdAccount.setNoOfDays(91);
		fdAccount.setAgeOfACHolder(30);
		assertEquals(750.0, fdAccount.calculateInterest(), 0.0);

	}
}
