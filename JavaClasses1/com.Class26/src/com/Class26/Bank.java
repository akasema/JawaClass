package com.Class26;

public class Bank {
	double money;
	
	public double chargeFee() {// overriding
		double fee=0;
		if (money<1000) {
			fee=money*0.1;
		}else {
			fee=0;
		}
		return fee;
		}
		
}
class PNC extends Bank {
	public double chargeFee() {// overriding
		double fee;
		if (money<1000) {
			fee=money*0.05;
		}else {
			fee=0;
		}
		return fee;
		}
}
