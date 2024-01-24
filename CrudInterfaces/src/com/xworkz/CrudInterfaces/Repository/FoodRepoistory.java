package com.xworkz.CrudInterfaces.Repository;

public interface FoodRepoistory {
	
	boolean onSave(String foodName);
	String[] read();

}
