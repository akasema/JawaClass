package com.Class14;

public class LongStrSubStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String longStr= "I am wery happy becouse today is not Monday";
		String smallStr= longStr.substring(10);//10 dan sonras�n� substrng olarak bas
		
		String partString=longStr.substring(10,15);//10 dan ba�layarak 15 e kadar basar
		// son rakkam stringin uzunlu�undan fazla olsa error verir
		
		
		System.out.println(smallStr);
		System.out.println(partString);		

	}

}
