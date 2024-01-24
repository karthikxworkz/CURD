package com.xworkz.CrudInterfaces.Service;

import com.xworkz.CrudInterfaces.Repository.FoodRepoistory;

public class FoodServiceImplementation  implements FoodService{
	
	private FoodRepoistory repoistory;

	public FoodServiceImplementation(FoodRepoistory repoistory) {
		this.repoistory = repoistory;
	}
	public FoodRepoistory getRepoistory() {
		return repoistory;
	}

	@Override
	public boolean ValidateandSave(String foodName) {
		if(foodName.isEmpty()
				||foodName.isBlank()
				||(foodName.length()<3&&foodName.length()>25)
				||foodName==null) {
			System.out.println("give correct name");
		}else{
			boolean exist=isExists(foodName);
			if(exist!=true) {
				boolean save=repoistory.onSave(foodName);
				if(save) {
					System.out.println("food name saved successfully");
					return true;
				}else {
					System.out.println("food name is not saved successfully");
					return false;
				}
				
			}else {
				System.out.println("food name is already exist");
			}
			}
			
			return false;
	}
          
	@Override
	public boolean isExists(String foodName) {
			  String[] food=repoistory.read();
			  if(foodName!=null&&food!=null) {
				  for(String name:food) {
					  if(name!=null) {
						  if(name.equals(foodName)) {
							  return true;
						  }
					  }
				  }
			  }
				
				return false;
	}
	}