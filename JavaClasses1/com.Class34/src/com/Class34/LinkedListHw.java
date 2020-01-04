package com.Class34;
import java.util.*;
public class LinkedListHw {

	  public static void main(String[] args) {
		   LinkedList<Integer> lList=new LinkedList<>();
		   lList.add(111);
		   lList.add(222);
		   lList.add(333);
		   lList.add(444);
		   lList.add(555);
		   lList.add(666);
		   int top=0,sum=0;
		   for (int i=0; i<=5; i++){
		     top=lList.get(i);
		     sum=top+sum;
		   }
		   System.out.println(sum);
		   
		    
		  }
	}


