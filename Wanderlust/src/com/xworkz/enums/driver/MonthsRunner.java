package com.xworkz.enums.driver;

import com.xworkz.enums.constant.Months;

public class MonthsRunner {
	public static void main(String[] args) {
		Months months=Months.APRIL;
		System.out.println(months);
		switch (months) {
		case JANURAY:
			System.out.println("this month is january");
			break;
		case FEBUARY:
			System.out.println("this month is febuary");
			break;
		case MARCH:
			System.out.println("this month is march");
			break;
		case MAY:
			System.out.println("this month is MAY");
			break;
		case APRIL:
			System.out.println("this month is APRIL");
			break;
		//case JUNE:
			//System.out.println("this month is JUNE");
			//break;
		 default:
			 System.out.println("this is default month");
			}
		
		String name=Months.APRIL.toString();
	}

}
