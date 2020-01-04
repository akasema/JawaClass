package com.Class31;
//
//public class Account {
//	private long accountNumber;
//	private double balance;
//	int num;
////getters
//	public long getAccountNumber() {
//		return accountNumber;
//	}
//public double getBalance() {
//	return balance;
//}
//
////setters
//public void setBalance(int amount) {
//	 if (amount>0) {
//		 balance=balance+amount;
//	 }
//}
//public void setAccountNumber(long account) {
//	if (String.valueOf(accountNumber).length()==9) {
//		this.accountNumber=accountNumber;
//	}
//}
public class Account{
//	private String empName;
//	  private int empAge;
//	  
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public int getEmpAge() {
//		return empAge;
//	}
//	public void setEmpAge(int empAge) {
//		this.empAge = empAge;
//	}
	
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getBirthmonth() {
		return birthmonth;
	}
	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
