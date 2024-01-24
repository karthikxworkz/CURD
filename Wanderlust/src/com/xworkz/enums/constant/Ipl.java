package com.xworkz.enums.constant;

public class Ipl {
	
	int index=0;
	String[] TeamList=new String[5];
	
	//read 
	public void onSave(String teamName) {
		System.out.println("TeamName:"+teamName);
		if(index<TeamList.length) {
			TeamList[index]=teamName;
			index++;
		}
		else {
			System.out.println("Team list is full");
		}
	}
	//create
	 public void getTeam() {
   	  for(int i=0;i<TeamList.length;i++) {
         System.out.println("Team list is not full");
     }
}
//update
	 public void update(String oldElement,String newElement) {
			for(int o=0;o<TeamList.length;o++) {
				if(TeamList[o]==oldElement) {
					TeamList[o]=newElement;
				}
			}
		}
//delete
	 public void delete(String element) {
			for(int o=0;o<TeamList.length;o++) {
				if(TeamList[o]==element) {
					TeamList[o]=null;
				}
			}
		}



}




