package com.Class31;

public class Account {
	private long accountNumber;
	private double balance;
	//getters
	public long getAccountNumber() {
		return accountNumber;
	}
public double getBalance() {
	return balance;
}

//setters
public void setBalance(int amount) {
	 if (amount>0) {
		 balance=balance+amount;
	 }
}
public void setAccountNumber(long account) {
	if (String.valueOf(accountNumber).length()==9) {
		this.accountNumber=accountNumber;
	}
}

}
