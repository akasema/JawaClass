package review5;

public class StringManupRecap {

	public static void main(String[] args) {
		// program� �al��t�r a��klamalar printte 
		String str="Hello ";
		System.out.println(str.length()+"..uzunlugu olcer ");
		
		System.out.println(str.toLowerCase()+"..hepsi lowercase olsun "); 
		
		System.out.println(str.toUpperCase()+"..Hepsi buyuk olsun");  
		
		System.out.println(str.equals("hello")+"..E�it midir boolean--true veya false verir case sensitive");

		System.out.println(str.equalsIgnoreCase("hello")+"..E�it midir boolean--true veya false verir case sensitive ignor eder");

		System.out.println(str.contains("hel")+"..i�erir mi--boolean"); 
		
		System.out.println(str.startsWith("H")+"..bununla ba�lar m�--boolean--case sensitive");
		
		System.out.println(str.startsWith("ll", 2)+"..2. karakterden ba�la bununla ba�lar m�--boolean--case sensitive");
		
		System.out.println(str.endsWith("el")+"..bunla  m� biter--boolean"); 
		
		System.out.println(str.isEmpty()+"..bo� mu--boolean"); 
		
		System.out.println(str.toLowerCase().contains("LL"));
		
		System.out.println(str.concat(" ").concat("Hello")+"birle�tirir");
		
		System.out.println(str.trim()+"aradaki bo�lluklar� tra� eder al�r");
	
	System.out.println(str.charAt(2)+" index 2 deki karakteri basar.0,1,2,3,4 index");
	
	String newStr= ""+str.charAt(0)+str.charAt(1)+str.charAt(3);
	System.out.println(newStr);
	System.out.println(str.indexOf('l')+"..stringin o harfin indexini basar");
	
	System.out.println(str.indexOf("Hell")+"..stringin o baslang�� indexini basar");
	
	System.out.println(str.indexOf("H", 2)+"..2. karakterden sonra kac tane H var ara.. (yoksa -1 basar");
	
	System.out.println(str.replace("He", "Ce"+" He ile Ce yi de�i�tirir"));
	
	}

}
