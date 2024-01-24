package com.xworkz.enums.driver;

import com.xworkz.enums.constant.Weeks;

public class WeeksRunner {
	public static void main(String[] args) {
		Weeks week=Weeks.FRIDAY;
		switch (week) {
		case SUNDAY:
			System.out.println("This day is sunday");
			break;
		case MONDAY:
			System.out.println("This day is monday");
			break;
		case TUESDAY:
			System.out.println("this day is tuesday");
			break;
		case WEDNESDAY:
			System.out.println("this day is wednesday");
			break;
		case THURSDAY:
			System.out.println("this day is thursday");
		break;
//		case FRIDAY:
//			System.out.println("this day is friday");
//            break;
		case SATURDAY:
			System.out.println("this day is saturday");
			break;
		default:
			System.out.println("this is default method");
			break;
				
		}
	}

}
