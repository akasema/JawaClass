package com.Class26;

public class TestBank {

	public static void main(String[] args) {
		
			Bank bank=new Bank();
			bank.money=900;
			bank.chargeFee();
			double fee=bank.chargeFee();
			System.out.println("Bank Fee= "+ fee);
			
			PNC pnc =new PNC();
			pnc.money=900;
			double pncFee=pnc.chargeFee();
			System.out.println("PNC Fee= "+ pncFee);
			
			}

	}


