package com.Class14;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Split method splits this string around matches of the given regular expression
		// it will return with array of Strings 
		
		
		String str="Video provides a powerful way to help you prove your point. "
				+ "When you click Online Video, you can paste in the embed "
				+ "code for the video you want to add. ";

		String[] array=str.split(" ");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);// bu textin kelimelerini basar 
		}
		System.out.println("===============================");	
		//How we can find how many sentences are in the following string?
			
			String str1="Today is sunday. today is sunny day. and we are having java class.";
			
			String[] array2=str1.split("\\.");// "." ile c�mleleri ay�ramay�z . bis regular expressionn de�il. 
			// bu sebeple "\\." demek laz�m . y� anlatmak i�in
			
			System.out.println("The  number of sentences in the given string is :"+array2.length);
			System.out.println("================================");
			
			for (String string : array2) {
				System.out.println(string);
		}
		
	}

}
