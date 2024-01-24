package com.xworkz.enums.driver;

import com.xworkz.enums.constant.Pen;

public class PenRunner {
	public static void main(String[] args) {
		Pen pen = new Pen();
		Pen pen1=new Pen();
		pen1.name="Jatter";
		System.out.println(pen.getClass().toString());
		System.out.println(pen.toString());
		System.out.println(pen.equals(pen1));
	}

}
