package com.Class12;

public class StringManupulation2 {

	public static void main(String[] args) {
	
		 /*
         * .contains();
         * This method  searches the sequence of characters in the string.
         * If the sequences of characters are found,
         * then it returns true otherwise returns false.
         */
        String sentence="It was raining";
        String sen="raining";
        System.out.println(sentence.contains(sen));
        System.err.println(sen.contains(sentence));
        
        System.out.println(sentence.contains("was"));
        
        // Create two Strings and initaialize them with some value.
        //implement the following methods on those strings.
        
        /*
         * sen.length();
         */
        System.out.println(" Sentence Length(bo�luklar dahil"+sentence.length());
        /* sen.equals();
         * sen.contains(s);
         * sen.toUpperCase();
         * sen.toLowerCase();
         * sen.equalsIgnoreCase(anotherString);
         */
        
    }
	
	}


