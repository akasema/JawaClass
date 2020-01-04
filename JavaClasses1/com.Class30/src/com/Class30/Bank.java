package com.Class30;

public interface Bank {
	
	void haveChecking();
	void haveSavings();

}
interface Trustable{
	void Trust();
}
class Finance{
	void financing() {
		System.out.println(" Bank can Finance");
		}
}
class BOA extends Finance implements Bank, Trustable{
	String name="Bank of America";
	@Override
	public void haveChecking() {
		System.out.println("Bank of America has checking account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("Bank of America has saving account");
		
	}

	@Override
	public void Trust() {
		System.out.println("Bank of America is a Trustable Bank");
		
	}
	}
class CapitalOne extends Finance implements Bank, Trustable{
	String name="CapitalOne";
	@Override
	public void haveChecking() {
		System.out.println("CapitalOne has checking account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("CapitalOne has saving account");
		
	}

	@Override
	public void Trust() {
		System.out.println("CapitalOne is a Trustable Bank");
		}
}
class CapOneChild extends CapitalOne{	
}