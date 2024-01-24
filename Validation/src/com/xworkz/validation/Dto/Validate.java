package com.xworkz.validation.Dto;

public class Validate {
	public static void main(String[] args) {
		byte value=30;
		String byteValue=Byte.toString(value);
		System.out.println(byteValue);
		
		int num=60;
		String intNum=Integer.toString(num);
		System.out.println(intNum);
		
		short val=67;
		String shortValue=Short.toString(val);
		System.out.println(shortValue);
		
		long contactNum=708988900;
		String longNum=Long.toString(contactNum);
		System.out.println(longNum);
		
		float ratings=9.0f;
		String floatRate=Float.toString(ratings);
		System.out.println(floatRate);
		
		//Original converting
		Byte b=Byte.valueOf(value);
		System.out.println(b.valueOf(value));
		
		
	}

}
