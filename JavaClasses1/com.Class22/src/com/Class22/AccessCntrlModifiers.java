package com.Class22;
//Access modifiers can put restrictions on how part of our codes can be accessed.
//As the name suggests access modifiers in Java helps to restrict the scope (access level) of a class, method and some other concepts which we will learn soon.
//There are four types of access modifiers available in java:
//1.    Public     (Visible to the world). Public visibility means that this method can be accessed anywhere in the program as long as you have an instance of this class to call it from.
//2.    Private     (Visible to the class only). Private visibility means that this method can’t be accessed out of this class.
//3.	Default
//4.protected
//for Classes only 2 modifier public and default 
//

public class AccessCntrlModifiers {
	public void publicModifier() {
		System.out.println("This is Public Method");
		}
protected void publicModifier1() {
		System.out.println("This is Protected Method");
		}
private void publicModifier2() {
		System.out.println("This is Private Method");
		}
//default modifiers no need to write name	
void publicModifier3() {
		System.out.println("This is Default Method");
		}
	public static void main(String[]args) {
		AccessCntrlModifiers str1=new AccessCntrlModifiers();
		str1.publicModifier2();
		str1.publicModifier3();
		str1.publicModifier1();
		str1.publicModifier();
		
		
}
}