package com.Class10;

public class Test222 {

		  public static void main(String[] args) {
			    
		    	int n = 4;
		        for(int i = 0; i < n; i++){
		          
		           System.out.print('$');
		            
		            for(int j = 0; j < n-2; j++){
		              if(i > 0 && i < n-1){
		                System.out.print(" ");
		              }
		              else{
		                System.out.print('$');
		              }
		          }
		          System.out.println('$');
		        }
		  }
		}


