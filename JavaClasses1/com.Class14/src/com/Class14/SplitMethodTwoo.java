package com.Class14;

public class SplitMethodTwoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// how many clause are there in the foloowing string OR 
		// how to separate comma delimited string 
		
		String str="if you come to class early ,"
		+"and you study more,"
		+"also you can learn more,"
		+"and you can leave early.";
		
		String[] array=str.split(",");
		for (int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("=============");
		
		String str1="Wellcome to Syntax Technologies";
		
		String [] array2=str1.split(" ", 3);// split with" " but limit with 3
		// 3 e böl ve daha fazlasýný yapma 
		
		for (int i=0; i< array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}

}
