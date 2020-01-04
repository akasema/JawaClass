package com.Class27;

public class Constructors {
	
	    Constructors(){
	        this(1);// (1)bu thisler oldugundan önce bu çalýþýr 
	        System.out.println("Hi");// en son bu yazar
	    }
	    Constructors(int x){// this 1  parametreli bunuiþaret etti
	        this(1,2);// burda da iki parametreliyi iþaret ediyor
	        System.out.println("Hello");// ikinci bu yazar 
	    }
	    Constructors(int x,int y){//(3) numarada buraya gelir 
	        System.out.println("How are you");// ilk bu yazar 
	    }
	   public static void main(String[] args) {
		
	     Constructors obj=new Constructors();
	    }


}
