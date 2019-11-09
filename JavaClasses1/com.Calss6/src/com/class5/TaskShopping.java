package com.class5;

import java.util.Scanner;

public class TaskShopping {

public static void main(String[] args) {
	/* ask user to ente rboolean value for sale
	 * if no sale-->i am not shopping 
	 * if sale --> check prices of item
	 * calculate discount
	 * if price < 20 --> discount 10%
	 *  price between 20-100 --> 20%
	 *  if between 100-500 --> 30%
	 *  anything -->5*%
	 *  print"After discount --- the price of the item reduce from -- to ---
	 */
	int discount;
	boolean sale;
	int initPrice;
	Scanner Scan = new Scanner(System.in);
	System.out.println("There is Sale True or False ?");
	sale=Scan.hasNextBoolean();
	
	if (!sale) {
		System.out.println("No Shopping");
	} else System.out.println("Please Enter the Price of good");
		int price=Scan.nextInt();
		initPrice=price;
		if (price<20) {
			discount=10;
			price=((price*10)/100);
		}else if (price>20 && price<100) {
			discount=20;
			price=((price*20)/100);
		}else if (price>100 && price<500) {
			discount=30;
			price=((price*30)/100);
		}else {
			discount=5;
			price=((price*5)/100);
		}
		System.out.println("After discount " + discount + " the price of the item reduce from " +initPrice +" to " + price);
	}
}


}
