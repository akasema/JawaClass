package com.Class27;
// define a class card with 2 methods and this class should have 4
//subclasses in which some behovior can be over,dden and some can implemen it is own behovior
public class Card {
	public void chargeInterest() {
		System.out.println("Card Charges 25% interest");
	}
public void creditLimit() {//overridden by AX
	System.out.println("Credit limit of the card is 5000");
}
}
class AX extends Card{
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the card 25000");
	}
}

class MC extends Card{
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the card 15000");
	}
	public void cashBack() {
		System.out.println("Mastercard gives back of3%");
	}
	
}
class Visa extends Card{
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the card 20000");
	}
}
class Discovery extends Card{
	public void applePay() {// overriding method
		System.out.println("Discovery can take Apple Pay");
	}
	
}