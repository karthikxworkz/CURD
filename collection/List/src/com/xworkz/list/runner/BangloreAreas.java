package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.List;

public class BangloreAreas {
	
	public static void main(String[] args) {
		List areasList=new ArrayList();
		areasList.add("GandhiNagar");
		areasList.add("Rajajinagar");
		areasList.add("MAjestic");
		areasList.add("sadashivaNagar");
		areasList.add("Hebbal");
		areasList.add("Yelhonka");
		areasList.add("NES");
		areasList.add("RR nagar");
		areasList.add("IndraNAgar");
		areasList.add("Subhrumanya nagar");
		
		areasList.add("Whitefield");
		areasList.add("hosur");
		areasList.add("varthur");
		areasList.add("Vijangar");
		areasList.add("magdi road");
		areasList.add("chandra layout");
		areasList.add("Bridgae");
		areasList.add("Orion");
		areasList.add("rajkumar");
		areasList.add("yuvartha");
		areasList.add("yuva");
		
		System.out.println("Listed are:"+areasList);
		System.out.println("Size are:"+areasList.size());
		areasList.forEach((BTmlayout)->System.out.println(BTmlayout));
		System.out.println(areasList);
	}

}
