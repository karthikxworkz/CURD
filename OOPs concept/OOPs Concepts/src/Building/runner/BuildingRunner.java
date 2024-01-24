package Building.runner;

import Building.Abstractimplements.ResidentalBuliding;
import Building.Abstracts.Building;

public class BuildingRunner {
	public static void main(String[] args) {
		ResidentalBuliding rb=new ResidentalBuliding();
		rb.piller();
		rb.window();
		rb.doors();
		rb.tiles();
		rb.electricconnection();
	
	}
}