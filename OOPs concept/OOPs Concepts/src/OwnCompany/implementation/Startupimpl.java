package OwnCompany.implementation;

import OwnCompany.abstacts.Startup;

public class Startupimpl extends Startup{
	public void name() {
		System.out.println("this is the startup company");
	}
	public int noOfWorkers() {
		return 456;
	}

}
