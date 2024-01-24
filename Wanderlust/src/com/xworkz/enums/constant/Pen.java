package com.xworkz.enums.constant;

public class Pen {
	public String name="Reyonds";
	private int price=50;
	private String colour="Black";
	private boolean isGoodWriting=true;
	
	public String toString() {
		return "Pen:(name:"+name+
				""+"Price"+""+price+
				""+"colour"+""+colour+
				""+"isGoodWriting"+""+isGoodWriting+")";
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
