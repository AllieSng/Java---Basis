package com.sourceit.java.basic.petrenko.ht10.bank;

public class Account {
	private Client client;
	private Integer accountId;
	private int accountBalance;

	@Override
	public String toString() {
		return "Account [client=" + client.name + ", accountId=" + accountId
				+ ", accountBalance=" + accountBalance + "]";
	}

	public Account(Client client, int accountId, int accountBalance) {
		this.client = client;
		this.accountId = accountId;
		this.accountBalance = accountBalance;
	}

	public Client getOwner() {
		return client;
	}

	public void setOwner(Client owner) {
		this.client = owner;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Integer getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void increaseBalance(int sum) {
		try {
			accountBalance = accountBalance + sum;
			System.out.println("Account number: " + accountId + ". Balance was increased by "+ sum + " amount");
		} catch (NullPointerException e) {
			System.out.println("Enter a positive amount of money");
		}
	}

	public void decreaseBalance(int sum) {
		try {
			if (accountBalance >= sum) {
				accountBalance = accountBalance - sum;
				System.out.println("Account number: " + accountId + ". Balance was decreased by " + sum);
			} else
				System.out.println("Account number " + accountId + ". Not enough funds in your account. Your balance is : "+ accountBalance);
		} catch (NullPointerException e) {
			System.out.println("Enter a positive amount of money");
		}
	}

}
