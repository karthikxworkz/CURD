package com.xworkz.CrudInterfaces.Runner;

import com.xworkz.CrudInterfaces.Repository.StreamsRepoistory;
import com.xworkz.CrudInterfaces.Repository.StreamsRepositoryImplementation;
import com.xworkz.CrudInterfaces.Service.StreamsService;
import com.xworkz.CrudInterfaces.Service.StreamsServiceImplementation;

public class StreamsRunner {
	public static void main(String[] args) {
		StreamsRepoistory repository=new StreamsRepositoryImplementation();
		StreamsService service=new StreamsServiceImplementation(repository);
		service.ValidateandSave("Civil");
		service.ValidateandSave("Civil");
	}

}
