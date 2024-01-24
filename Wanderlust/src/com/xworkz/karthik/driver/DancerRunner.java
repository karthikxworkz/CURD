
package com.xworkz.karthik.driver;

import com.xworkz.karthik.things.Person;

public class DancerRunner {
	public static void main(String[] args) {
		Person person=new Person();
		person.setDancerName("Punneth");
		person.setNoOfDancers(17);
		person.setRatings(9.7f);
		person.setEntryfee(5000);
		
		String Name=person.getDancerName();
		int dancers=person.getNoOfDancers();
		float ratings =person.getRatings();
		int fee=person.getEntryfee();
	}

}
