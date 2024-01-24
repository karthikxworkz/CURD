package com.xworkz.enums.constant;

public class Toy {
	
	public String toyName="Puzzle";
	private int price=120;
	private String colour="all colour";
	private String shape="rectangle";
	private String toyType="playing";
	
	public String toString() {
		System.out.println("To string method");
		return "Toy:(toyName:"+toyName+
				""+"price"+""+price+
				""+"colour"+""+colour+
				""+"shape"+""+shape+
				""+"toyType"+""+toyType+")";
	}
	public int hashcode() {
		return price;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()==obj.getClass())
			return true;
		return true;
		
	}

}
