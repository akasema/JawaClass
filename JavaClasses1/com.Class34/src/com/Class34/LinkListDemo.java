package com.Class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		llist.add(2,"How are you");
		System.out.println(llist);
		llist.set(1,"Good Bye");
		//retrive one element
		System.out.println(llist.get(2));
		//retrive all elements
		
		System.out.println("Print with for loop");		
		for (int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));}
		
		System.out.println("Print with for loop");
		for (String ll:llist) {
		System.out.println(ll);
			}
		 		System.out.println("Print with iterator");
		Iterator<String> it=llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	}

