package com.Class33;

import java.util.ArrayList;

public class ArrayListRepl {

	public static void main(String[] args) {
	 		
		ArrayList<Integer> listA=new ArrayList();
		listA.add(0);
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listA.add(5);
		listA.isEmpty();
		
		ArrayList<Integer> listB=new ArrayList();
		
		for (int i=0; i<5; i++) {
				int b1=listA.get(i);
				listB.add(b1);
				listB.add(b1);
			}		
		System.out.print(listB);
	}
}
