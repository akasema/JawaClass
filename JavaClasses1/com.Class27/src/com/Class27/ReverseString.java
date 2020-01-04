package com.Class27;

public class ReverseString {

		final String reverse(String input){
		    char[] in = input.toCharArray();
		    int begin=0;
		    int end=in.length-1;
		    char temp;
		    while(end>begin){
		        temp = in[begin];
		        in[begin]=in[end];
		        in[end] = temp;
		        end--;
		        begin++;
		    }
		    return new String(in);
		}
		
//		diðer method
		  public static void main(String[] args) {
		ReverseString nstr=new ReverseString();
		String s=nstr.reverse("kadir");
			  System.out.println(s);
		} 
		  final String reverseString(String str) {
			  char[] in=str.toCharArray();
			  char temp;
			  for (int i=str.length()-1; i>=0;i--) {
				in[i]=str.charAt(str.length()-1-i);
				 } 
			  return new String(in);
			  
			}