package com.Class22;

public class MethodTypes {
	 int add(int i1, int i2){
	     int add=i1+i2;
	     return add;
	   }
	   int mult(int i1, int i2){
	     int mult=i1*i2;
	     return mult;
	   }
	   int subt(int i1, int i2){
	     int subt=i1-i2;
	     return subt;
	   }
	   boolean isTrue(){
		   boolean isTrue=true;
		   System.out.println(isTrue);
		 return isTrue;
		 }
	   
	   String makeCapital(String str){
		    String str1=str.toUpperCase();
		    return str1;
	   }
	   char getChar(String str1, int i){
		    char getChar=str1.charAt(i);
		    return getChar;
		  }
	   void printTwice(String str){
		    System.out.println(str);
		    System.out.println(str);
		  }
	   boolean bothEven(int num1, int num2){
		   boolean bothEven=false; 
		   if (num1%2==0 && num2%2==0){
		    bothEven=true;
		  }else {
		    bothEven=false;
		  }
		  return bothEven;
		  }
	   
	   String makeThreeSubstr(String str, int start, int end ){
		    String newstr=str.substring(start, end);
		    System.out.print(newstr);
		    System.out.print(newstr);
		    System.out.print(newstr);
		    return newstr;
		  }
			
	   
	   
	   public static void main(String[]args){
	     
		   MethodTypes result=new MethodTypes();
		   System.out.println("Addition "+result.add(10,20));
		   System.out.println("Multiplication "+result.mult(10,3));
		   System.out.println("Subtraction "+result.subt(30,10));
		  
		   MethodTypes bln=new MethodTypes();
		   bln.isTrue();
		   
		   MethodTypes str2=new MethodTypes();
		   System.out.println(str2.makeCapital("kadir"));
		   
		   MethodTypes  ch1=new MethodTypes();
		   System.out.println(ch1.getChar("hello", 1));
		   
		   MethodTypes twc=new MethodTypes();
		   twc.printTwice("Don't make me say this twice!");
		   
		   MethodTypes bothEv=new MethodTypes();
		    System.out.println(bothEv.bothEven(3,4));
		    
		    str2.makeThreeSubstr("hello", 0, 2);
		    System.out.println();
		    str2.makeThreeSubstr("shenanigans", 3, 7);
		 }
	   }



