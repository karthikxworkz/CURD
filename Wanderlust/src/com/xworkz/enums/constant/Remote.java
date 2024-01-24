package com.xworkz.enums.constant;

public class Remote {
	
	public String name="Lg";
	private int price=320;
	private int noOfButtons=45;
	private String colour="black";
	private int noOfShells=2;
	private String type="Sphere";
	
	public String toString() {
		return "Remote:(name:"+name+
				""+"price"+""+price+
				""+"noOfButtons"+""+noOfButtons+
				""+"colour"+""+colour+
				""+"noOfShells"+""+noOfShells+
				""+"type"+""+type+")";
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
