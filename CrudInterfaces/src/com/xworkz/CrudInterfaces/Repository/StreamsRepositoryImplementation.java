package com.xworkz.CrudInterfaces.Repository;

public class StreamsRepositoryImplementation implements StreamsRepoistory {

	private String[] stream=new String[4];
	private int index=0;
	
	@Override
	public boolean onSave(String streamName) {
		if(stream==null||index>=stream.length) {
			System.out.println("Array is null and greater");
		} else {
			if(index<stream.length) {
				stream[index]=streamName;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		return stream;
	}
	

}
