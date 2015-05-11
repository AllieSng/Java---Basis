package com.sourceit.java.basic.petrenko.ht10.bank;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

	private String bankName;
	public ArrayList<Account> accounts;
	private int fund;

	Bank(String bankName, int fund) {
		this.bankName = bankName;
		this.fund = fund;
	}

	public String getBankName() {
		return bankName;
	}

	public int getFund() {
		return fund;
	}
	
	public int createAccount(Client client, int accountBalance) {
		if (accounts == null) {
			accounts = new ArrayList();
		}
		Account account = new Account(client, generateId(), accountBalance);
		accounts.add(account);
		for (Account accounta : accounts) {
			System.out.println("created accounts:" + accounta.getAccountId());
		}
		client.accounts.add(account);
		return account.getAccountId();
	}

	private int generateId() {
		int i = 0;
		boolean flag = true;
		while (flag) {
			Random rnd = new Random();
			i = 100000 + rnd.nextInt(900000);
			if (returnAccount(i) == null) {
				flag = false;
			}
		}
		return i;
	}

	public Account returnAccount(int accountId) {
		for (Account account : accounts) {
			if (accountId == account.getAccountId()) {
				return account;
			}
		}
		return null;
	}
}
