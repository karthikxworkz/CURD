package com.xworkz.enums.constant;

public class StringMethod {
	public static void main(String[] args) {
		 String name="Kempagouda";
		 String sentence="We Meet once again";
		 //length
		 System.out.println("sentence length:"+sentence.length());
		 //word count
	     for(int i=0;i<sentence.length();i++) {
	     System.out.println("sentence words count is:"+sentence.charAt(i));
         }
	     //character count
	     char[] ch=sentence.toCharArray();
	     for(int j=0;j<sentence.length();j++) {
	  System.out.println("character count is:"+sentence.charAt(j));
	     }
	     //reverse the String
	     for(int k=ch.length-1;k>=0;k--) {
	    	 System.out.println(ch[k]);
	    	 }
	     System.out.println(sentence.endsWith(sentence));
	     System.out.println(sentence.startsWith(sentence));
	     System.out.println(sentence.split(sentence));
	     System.out.println(sentence.toLowerCase());
	     System.out.println(sentence.isEmpty());
	     System.out.println(sentence.repeat(3));
	     System.out.println(sentence.replaceAll(name, sentence));
	     
}
}