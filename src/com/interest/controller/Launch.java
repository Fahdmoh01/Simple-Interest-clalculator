package com.interest.controller;

import java.util.Scanner;
//import java.io.*;
//import com.interest.entities.FDAccount;
//import com.interest.entities.RDAccount;
import com.interest.entities.*;

public class Launch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("********************************************************");
			System.out.println("\n1. Interest Calculator --SB: ");
			System.out.println("2. Interest Calculator --FD: ");
			System.out.println("3. Interest Calculator --RD: ");
			System.out.println("4. Exit");
			System.out.println(" Enter options(1..4): ");
			System.out.println("********************************************************");

			choice = sc.hasNextInt() ? sc.nextInt() : 0;

			switch (choice) {
			case 1:
				SBAccount sbAccount = new SBAccount();
				String accountType;

				System.out.println("Enter Account Type:");
				accountType = sc.next();
				sbAccount.setAccountType(accountType);

				System.out.println("Enter the Average amount in your account:");
				sbAccount.setAmount(sc.nextDouble());

				System.out.println("Interest gained: Rs." + sbAccount.calculateInterest());
				System.out.println(" ");
				System.out.println(" ");
				break;
			case 2:
				FDAccount fdAccount = new FDAccount();
				System.out.println("Enter the FD Amount");
				fdAccount.setAmount(sc.nextDouble());
				// days
				
				System.out.println("Enter the number of days");
				int days = sc.nextInt();
				while (days < 0) {
					System.out.println("Invalid days, enter non-negatives");
					System.out.println("Enter the number of days");
					days = sc.nextInt();
				}
				fdAccount.setNoOfDays(days);
				// age
				
				System.out.println("Enter Account Holder age.");
				int age = sc.nextInt();
				while (age < 0) {
					System.out.println("Invalid age, enter non-negatives");
					System.out.println("Enter the correct age");
					age = sc.nextInt();
				}
				fdAccount.setAgeOfACHolder(age);

				System.out.println("Interest gained: Rs. " + fdAccount.calculateInterest());
				System.out.println(" ");
				System.out.println(" ");
				break;
			case 3:
				RDAccount rdAccount = new RDAccount();
				// months
				System.out.println("Enter the number of Months");
				int noOfMonth = sc.nextInt();
				while (noOfMonth < 0) {
					System.out.println("Invalid months, enter non-negatives");
					System.out.println("Enter the number of Months");
					noOfMonth = sc.nextInt();
				}
				rdAccount.setNoOfMonth(noOfMonth);
				// age
				System.out.println("Enter Account Holder age.");
				age = sc.nextInt();
				while (age < 0) {
					System.out.println("Invalid age, enter non-negatives");
					System.out.println("Enter the correct age");
					age = sc.nextInt();

				}
				rdAccount.setAgeOfACHolder(age);
				// amount
				System.out.println("Enter the amount:");
				rdAccount.setAmount(sc.nextDouble());
				System.out.println("Interest gained: Rs." + rdAccount.calculateInterest());
				System.out.println(" ");
				System.out.println(" ");
				break;
			case 4:
				System.out.println("Thank you for using the Simple Interest Calculator");
				break;
			default:
				break;

			}

		} while (choice != 4);
		sc.close();

	}
}
