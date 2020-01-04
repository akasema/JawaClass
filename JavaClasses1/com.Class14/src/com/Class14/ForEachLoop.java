package com.Class14;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String longStr = "I Am very happy today, because today is not Monday.";
		  
		 char[] charArray = longStr.toCharArray();
		 String anotherStr = "";
		 for (char element : charArray) {
	            if (element == 'a') {
	                anotherStr += 'e';
	            } else {
	                anotherStr += element;
	            }

	}

}
