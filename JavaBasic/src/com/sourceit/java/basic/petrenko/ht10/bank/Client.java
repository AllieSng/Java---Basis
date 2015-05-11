package com.sourceit.java.basic.petrenko.ht10.bank;

import java.util.ArrayList;

public class Client {
	String name;
	public ArrayList<Account> accounts;
	Bank bank;

	public Client(String name, Bank bank) {
		this.name = name;
		accounts = new ArrayList();
		this.bank = bank;
	}

	public void takeCredit(Bank bank, int accountId, int salary, int creditSum) {
		if (bank.getFund() / 100 >= creditSum && salary > 1000) {
			System.out.println("Congratulations, you took " + creditSum
					+ " in credit.");
			returnAccount(accountId).increaseBalance(creditSum);
		}
	}

	public void chargeAccount(int accountId, int sum) {
		returnAccount(accountId).increaseBalance(sum);
	}

	public Account returnAccount(int accountId) {
		for (Account account : accounts) {
			if (accountId == account.getAccountId()) {
				return account;
			}
		}
		return null;
	}

	public void sendMoneyToAnotherAccount(int accountSender,
			int accountReceiver, int sum) {
		try {
			bank.returnAccount(accountSender).decreaseBalance(
					sum + ((5 * sum) / 100));
			System.out.println("Kommission for sending is 5/%");
			bank.returnAccount(accountReceiver).increaseBalance(sum);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

	public void getMoney(int accountId, int sum) {
		returnAccount(accountId).decreaseBalance(sum);
	}

	public void viewBalance(int accountId) {
		System.out.println("Account number: " + accountId
				+ ". Current balance: "
				+ returnAccount(accountId).getAccountBalance());
	}
}
