package com.sourceit.java.basic.petrenko.ht10.bank;

public class Launcher {

	public static void main(String[] args) {

		Bank ukrsoz = new Bank("UkrSoz", 1000000);

		Client ivan = new Client("Ivan", ukrsoz);
		int accountId1 = ukrsoz.createAccount(ivan, 500);

		Client petr = new Client("Petr", ukrsoz);
		int accountId2 = ukrsoz.createAccount(petr, 600);

		ivan.viewBalance(accountId1);
		ivan.takeCredit(ukrsoz, accountId1, 3000, 6000);
		ivan.viewBalance(accountId1);
		ivan.chargeAccount(accountId1, 500);
		ivan.viewBalance(accountId1);
		ivan.sendMoneyToAnotherAccount(accountId1, accountId2, 200);
		
		petr.viewBalance(accountId2);
		petr.getMoney(accountId2, 100);
		petr.viewBalance(accountId2);

	}

}
