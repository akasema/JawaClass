package com.Class13;

public class StrManupl {

	public static void main(String[] args) {
		// Interview SORUSU
		
		String str1="Hello";
		String str2="Hello";//str2 pointing hello in str1
		
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1==str2);
		
		System.out.println("================");
		String str3=new String("Bye");
		String str4=new String("Bye");//eger boyle olusturursan bu str4 i�indeki de�er ayn� olsa bile bilgisayar onu yeni olarak al�r 
		
		
		System.out.println(str3.contentEquals(str4));// true veriri ��nki i�ini kar��la�t�r�r
		System.out.println(str3==str4);//bu durumda buras� fals ��kar ��nk� referans� ayn� m� diye bak�yor . bilgisayar buna iki ayr� de�er olu�turmu�
		
		System.out.println(str1.equalsIgnoreCase("HELLO"));
		
		System.out.println(str1.contains("ll"));
		System.out.println("============startwith end with=========");
		String str5="Today is Saturday";
		String str6="Today";
		System.out.println(str5.startsWith("To"));
		System.out.println(str5.contains(str6));
		
		System.out.println(str5.concat("...today Java Day"));
		
		System.out.println("=======Trimming========");
		
		String str7="      It is Sunny     ";
		
		System.out.println(str7.trim());// it is sunny diye basar
		
		System.out.println("==========Index Of==========");
		
		System.out.println(str5.indexOf('e'));// e nin indexini basacakt� ama e yok bu sebeple -1 basar
		System.out.println(str5.indexOf('a', 2));//2 den baslayarak a y� arara
		
		System.out.println("==========Char At========");
		
		System.out.println(str5.charAt(3));
	}

}
