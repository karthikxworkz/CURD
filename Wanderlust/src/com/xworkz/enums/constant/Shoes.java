package com.xworkz.enums.constant;

public class Shoes {
	
	public String shoesName="Puma";
	private int price=2500;
	private String colour="Black";
	@Override
	
	public String toString() {
		System.out.println("To string method");
		return "Shoes:(shoesName:"+shoesName+
			          ""+"price"+""+price+
			          ""+"colour"+""+colour+")";
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
