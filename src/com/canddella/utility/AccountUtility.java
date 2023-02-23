package com.canddella.utility;

import com.canddella.entity.Account;

public class AccountUtility {

	public static void main(String[] args) {
		
		Account savingsAccount = new Account();
		savingsAccount.accountName ="Savings Account";
		savingsAccount.accountBalance =100000;
		
		Account currentAccount = new Account();
		currentAccount.accountName ="Current Account";
		currentAccount.accountBalance =100000;
		
		System.out.println("Account Name"+"           "+"Account Balance");
		System.out.println(savingsAccount.accountName+"          "+savingsAccount.accountBalance);
		System.out.println(currentAccount.accountName+"          "+currentAccount.accountBalance);
		
	}

}
