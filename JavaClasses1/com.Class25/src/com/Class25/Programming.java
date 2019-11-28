package com.Class25;

public class Programming {
	
	void program(){
		System.out.println("ý Am Programming languages");
			}
	void program(String str){
		System.out.println("ý Am Programming "+str);
			}
	void program(String str, int i){
		System.out.println("ý Am Programming "+str+" and "+i);
			}
	static void newClass() {
		System.out.println("First overload form without parameters");
	}
	static void newClass(String str) {
		System.out.println("First overload form with parameters "+str);
	}
	static void newClass(String str, int i) {
		System.out.println("First overload form with parameters "+str+" and "+i);
	}
	
	private void prog() {
		System.out.println("This is Private method without parameters overloading");
			}
	private void prog(String str) {
		System.out.println("This is Private method with "+str+" parameters overloading");
			}
	private void prog(String str, int i) {
		System.out.println("This is Private method with "+str+" and "+i+ " parameters overloading");
			}
	
public static void main(String[] args) {
	Programming abc=new Programming();
		abc.program();
		abc.program("Java");
		abc.program("Java", 4);
		abc.newClass();
		abc.newClass("Java");
		abc.newClass("Java", 3);
		
		abc.prog();
		abc.prog("Java");
		abc.prog("Java", 3);
		
	
}
}
