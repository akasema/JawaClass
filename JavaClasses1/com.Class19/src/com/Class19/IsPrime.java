package com.Class19;

public class IsPrime {
	
	boolean isPrm(int sayi) {
		boolean isPrm= false;
		int x=0;	       
        for(int i=2; i<=sayi/2; i++){
            if(sayi%i==0){
                  x++;
                  break;
            }}
        if(x==0) {
        	System.out.println(sayi+" is Prime");
        	isPrm=true;
        }
        else  {
        	System.out.println(sayi+" is NOT prime");
        	isPrm=false;
        }
        return isPrm;     
            }

}
