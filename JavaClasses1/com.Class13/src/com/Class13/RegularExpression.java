package com.Class13;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Print only text not numbers
		 */
		
		String str="14234Hello14234Hello14234";
		System.out.println(str.replaceAll("[0-9]", ""));//[] �nemli Sya� haricindekileri bas
		System.out.println(str.replaceAll("[a-zA-Z]", ""));// Harf haricindekileri bas
										//Sadece buyuk yada kucuk harfleri basmas�n� da saglayabilirsin
System.out.println("============");	
	String a="^+&/%(Hello&^'=?How 653800You";
	System.out.println(a.replaceAll("[a-zA-Z0-9]", ""));// harf ve say� haricini bas
	System.out.println(a.replaceAll("[^a-zA-Z0-9]", ""));//harf ve say� haricini yok et
	System.out.println("======================");
	System.out.println(a.replaceAll("\\w", ""));//T�m normal karakterlere bo�luk bas di�erlerini yazd�r
	
	String str3="12-22-1990";
	System.out.println(str3.replace('-', '/'));
	System.out.println(str3.replace("-", "/"));
	System.out.println(str3.replaceFirst("-", "/"));
	}

}
