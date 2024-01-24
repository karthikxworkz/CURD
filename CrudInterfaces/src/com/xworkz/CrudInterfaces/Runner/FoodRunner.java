package com.xworkz.CrudInterfaces.Runner;

import com.xworkz.CrudInterfaces.Repository.FoodRepoistory;
import com.xworkz.CrudInterfaces.Repository.FoodRepoistoryImplementation;
import com.xworkz.CrudInterfaces.Service.FoodService;
import com.xworkz.CrudInterfaces.Service.FoodServiceImplementation;

public class FoodRunner {
	
	public static void main(String[] args) {
		FoodRepoistory repoistory = new FoodRepoistoryImplementation();
		FoodService service=new FoodServiceImplementation(repoistory);
		service.ValidateandSave("Veg Palav");
		service.ValidateandSave("Veg Palav");
		}

}
