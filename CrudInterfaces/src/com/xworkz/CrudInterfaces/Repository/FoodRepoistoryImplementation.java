package com.xworkz.CrudInterfaces.Repository;

public class FoodRepoistoryImplementation implements FoodRepoistory{
       
	private String[] food= {null,null,null};
	private int index=0;
	private String name="prasanna";
	@Override
	public boolean onSave(String foodName) {
		if(foodName!=null)
		{
			if(food.length<=index)
			{
				food[index]=foodName;
			}
			else {
				System.out.println("Array is full");	
			}
		}
		
		return false;
	}
	
	

	@Override
	public String[] read() {
		
		
		return food;
	}
	
}
