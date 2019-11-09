package review5;

public class StringManupRecap {

	public static void main(String[] args) {
		// programý çalýþtýr açýklamalar printte 
		String str="Hello ";
		System.out.println(str.length()+"..uzunlugu olcer ");
		
		System.out.println(str.toLowerCase()+"..hepsi lowercase olsun "); 
		
		System.out.println(str.toUpperCase()+"..Hepsi buyuk olsun");  
		
		System.out.println(str.equals("hello")+"..Eþit midir boolean--true veya false verir case sensitive");

		System.out.println(str.equalsIgnoreCase("hello")+"..Eþit midir boolean--true veya false verir case sensitive ignor eder");

		System.out.println(str.contains("hel")+"..içerir mi--boolean"); 
		
		System.out.println(str.startsWith("H")+"..bununla baþlar mý--boolean--case sensitive");
		
		System.out.println(str.startsWith("ll", 2)+"..2. karakterden baþla bununla baþlar mý--boolean--case sensitive");
		
		System.out.println(str.endsWith("el")+"..bunla  mý biter--boolean"); 
		
		System.out.println(str.isEmpty()+"..boþ mu--boolean"); 
		
		System.out.println(str.toLowerCase().contains("LL"));
		
		System.out.println(str.concat(" ").concat("Hello")+"birleþtirir");
		
		System.out.println(str.trim()+"aradaki boþlluklarý traþ eder alýr");
	
	System.out.println(str.charAt(2)+" index 2 deki karakteri basar.0,1,2,3,4 index");
	
	String newStr= ""+str.charAt(0)+str.charAt(1)+str.charAt(3);
	System.out.println(newStr);
	System.out.println(str.indexOf('l')+"..stringin o harfin indexini basar");
	
	System.out.println(str.indexOf("Hell")+"..stringin o baslangýç indexini basar");
	
	System.out.println(str.indexOf("H", 2)+"..2. karakterden sonra kac tane H var ara.. (yoksa -1 basar");
	
	System.out.println(str.replace("He", "Ce"+" He ile Ce yi deðiþtirir"));
	
	}

}
