package com.xworkz.karthik.things;

import java.util.Scanner;

public class Plastic {
   public static void main(String []args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("ENTER YOUR NAME");
		 String name=scan.nextLine(); 
		System.out.println("ENTER YOUR YEAR OF BIRTH"); 
		int name1=scan.nextInt();
		 greet(name);
		 }
		 //calculatingAge(age); }
		 public static void greet(String name) 
		{ System.out.println("Hello"+name); }
		// public static int calculatingAge(Int age) {
		// return age; }


}
