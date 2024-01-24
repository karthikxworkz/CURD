package com.xworkz.enums.constant;

public class Palindram {
     public static void main(String[] args) {
		String word="eye";
		if(isPalindrome(word)) {
			System.out.println(word + "is a palindrome");
		}else {
			System.out.println(word+"is not palindrome");
		} 
	}
     public static boolean isPalindrome(String word) {
		String lowercase=word.toLowerCase();
		StringBuilder reversed=new StringBuilder(lowercase).reverse();
		return lowercase.equals(reversed.toString());
	}
}

     
     

