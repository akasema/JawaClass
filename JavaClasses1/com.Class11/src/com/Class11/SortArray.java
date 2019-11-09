package com.Class11;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] actNames= {"John", "Smith", "Alex", "Tanaz"};
		String [] expNames= {"Smith", "John", "Alex", "Tanaz"};
		Arrays.sort(actNames);
		System.out.println(Arrays.toString(actNames));
		//To sort elements of arrays
		Arrays.sort(expNames);
		
		String act=Arrays.toString(actNames);
		String exp=Arrays.toString(expNames);
		
		System.out.println(act.equals(exp));
		
		int[] numbers= {123,34,15,66,99,23,44,55,67,88,45,677,889,900,};
		for (int i:numbers) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Arrays.sort(numbers); // Arrayý sort eder
		for (int i:numbers) {
			System.out.print(i+" ");
		}
		}
}


