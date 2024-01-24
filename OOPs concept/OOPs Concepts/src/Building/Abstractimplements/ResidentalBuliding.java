package Building.Abstractimplements;

import Building.Abstracts.Building;

public class ResidentalBuliding extends Building {
	@Override
	  public void piller() {
		System.out.println("piller building");
	  }
		public void window() {
		System.out.println("windows in building");
		}
		public  void doors() {
		System.out.println("Doors of building");	
		}
		public  void tiles() {
		System.out.println("Tiles in building");	
		}
		public  void electricconnection() {
		System.out.println("electric connection in buildings");

	  }
}
