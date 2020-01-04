package com.Class27;

public class CarTEst {
	public static void main(String[] args) {
		// take an object of the child class and give referance to rhe Parent
		//  referance variable = object created 
		
		
		Card card=new AX();// bu variableler card vs Card type olarak yazýlýyor 
		//ama runtime da child deki methodu çalýþtýrýyor 
		
		card.chargeInterest();
		card.creditLimit();
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card card2=new Visa();
		card2.creditLimit();
		
		int[] numArray= {10,12,13};
		String[] stringArray= {" aa","bb","cc"};
		// first we created objects and assigning to the variables and then 
		//stored those variables inside an array
		
		Card[] cardArray= {card,card1,card2};
		
		// creating objects and store it in the array directly 
		Card[] cardArray1= {new MC(), new AX(), new Visa(), new Discovery()};
		
		for (Card myCard:cardArray1) {
			myCard.creditLimit();
		}
		//OR normal for loop
		
		for(int y=0; y<cardArray1.length; y++) {
			cardArray1[y].creditLimit();
		}
		 
		Card c1=new Card();
		c1.chargeInterest();
		c1.creditLimit();
		
		AX ax1=new AX();
		ax1.chargeInterest();
		ax1.creditLimit();
		
		MC mc1=new MC();
		mc1.cashBack();
		mc1.chargeInterest();
		mc1.creditLimit();
		MC mc2=new MC();
		MC mc3=new MC();
		
		Card cc=new MC();
		cc.chargeInterest();
		cc.creditLimit();
		
		MC[] masterCards= {mc1,mc2,mc3};// nbu array sadece mc cardlarý alabilir diðerlerini içine alýrsan error
		
		for (MC mCard:masterCards) {
			mCard.cashBack();
			mCard.chargeInterest();
			mCard.creditLimit();
			
		}
		
		
		
		
		
		
		
	}

}
