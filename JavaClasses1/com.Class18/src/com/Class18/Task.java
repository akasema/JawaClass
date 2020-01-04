package com.Class18;

public class Task {
	

	void isLarger(int a, int b) {
		if (a>b) {
			System.out.println("a="+a+"is  larger than b="+b);
		}else if (a<b){
			System.out.println("b="+b+"is  larger than a="+a);
		}else {
			System.out.println("Numbers are equal");
		}
	}
	
	void isEven(int c) {
		if (c%2==0) {
			System.out.println("The number "+c+" is even");
		}else {
			System.out.println("The number "+c+" is odd");
		}
	}
	
	void palindrome(String word) {
        String reverse = "";
        for (int i =word.length() - 1; i >= 0; i--) {
              reverse = reverse + word.charAt(i);
        } 
		if (word.equals(reverse)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
        }
    
}
	
	public static void main(String[] args) {
		
		Task large=new Task();
		large.isLarger(4, 6);
		 Task odd=new Task();
		 odd.isEven(4);
		large.palindrome("civic");
		large.palindrome("kadir");
		
			}

}
