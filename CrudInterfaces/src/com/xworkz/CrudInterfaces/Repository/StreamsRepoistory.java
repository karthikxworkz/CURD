package com.xworkz.CrudInterfaces.Repository;

public interface StreamsRepoistory {
	
	boolean onSave(String streamName);
     String[] read();
}
