package com.Class13;

public class ReplaceMethodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello Dear Dan , How are you Dan, nnn Dan ?";
		
		System.out.println(str.replace('e', 'z'));
		System.out.println(str.replace("Dear", "respected"));
		System.out.println(str.replaceFirst("Dan", "Ali")); //Birinci stringi de�i�tirir
	System.out.println(str.replaceAll("Dan", "Ali"));// Hepsini de�i�tir
	System.out.println(str.replaceAll(regex, replacement));
	
	
	
	}

}