package com.xworkz.CrudInterfaces.Service;

import com.xworkz.CrudInterfaces.Repository.StreamsRepoistory;

public class StreamsServiceImplementation implements StreamsService {
	private StreamsRepoistory repoistory;
	
	public StreamsServiceImplementation(StreamsRepoistory repoistory) {
		this.repoistory = repoistory;
	}

	public StreamsRepoistory getRepoistory() {
		return repoistory;
	}
	@Override
	public boolean ValidateandSave(String streamName) {
		if(streamName.isEmpty()
		   ||streamName.isBlank()
		   ||streamName.length()<4
		   &&streamName.length()>25
		   ||streamName==null) {
			System.out.println("Give a correct Name");
		} else {
			boolean exist=isExists(streamName);
			if(exist!=true) {
				boolean save=repoistory.onSave(streamName);
				if(save) {
					System.out.println("Stream name saved successfully");
					return true;
				} else {
					System.out.println("Stream name is not saved successfully");
					return false;
				}
			} else {
				System.out.println("Stream name is already exist");
			}
		}
		return false;
	}
	
@Override
	public boolean isExists(String streamName) {
	  String[] stream=repoistory.read();
	  if(streamName!=null&&stream!=null) {
		  for(String name:stream) {
			  if(name!=null) {
				  if(name.equals(streamName)) {
					  return true;
				  }
			  }
		  }
	  }
		
		return false;
	}
}
