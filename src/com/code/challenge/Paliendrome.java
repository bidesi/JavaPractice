package com.code.challenge;

public class Paliendrome {

	/*
	 * consider only alpha numeric characters
	 * if palindrome return length of original string
	 * else -1
	 */
	
	
	
	public static void main(String[] args) {
		//String strInput = "A man, A plan a , canal,: panama";
		//String strInput = "race a car";
		String strInput = "AmanaplanAcanalpanama";

		int palindromeLength = isPalindrome1(strInput);
		System.out.println(palindromeLength);
		
		palindromeLength = isPalindrome2(strInput);
		System.out.println(palindromeLength);
	} 		

	

    public static int isPalindrome1(String inputStr) {
    	inputStr = inputStr.replaceAll("[^A-Za-z0-9]", "");
    	inputStr = inputStr.toLowerCase();
    	int length = inputStr.length();
    	int n = length;
    	for(int i = 0; i < (length/2+1); i++) {
    		if(inputStr.charAt(i) != inputStr.charAt(n-1)) {
    			return -1;
    		}
    		n--;
    	}
    	return length;
    }
    
    public static int isPalindrome2(String inputStr) {
    	inputStr = inputStr.toLowerCase();
    	int length = inputStr.length();
    	
    	int n = length-1;
    	int i = 0;
    	
    	while(i < n) {
    		if(!Character.isLetterOrDigit(inputStr.charAt(i))) {
    			i++;
    			continue;
    		}
    		
    		if(!Character.isLetterOrDigit(inputStr.charAt(n))) {
    			n--;
    			continue;
    		}
    		
    		if(inputStr.charAt(i) != inputStr.charAt(n)) {
    			return -1;
    		}
    		i++;
    		n--;
    	}
    	
    	return length;
    }

}
