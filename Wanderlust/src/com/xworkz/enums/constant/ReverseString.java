package com.xworkz.enums.constant;

public class ReverseString {
	
	public static void main(String[] args) {
		int number=987654;
		String number1=Integer.toString(number);
		
		//using StringBuilder to reverse the string
		StringBuilder reversed=new StringBuilder(number1).reverse();
		
		//Converting back to integer
		int reversedNumber=Integer.parseInt(reversed.toString());
		System.out.println("reversed number:"+reversedNumber);
		
	}

}
