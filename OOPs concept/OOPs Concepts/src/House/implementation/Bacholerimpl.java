package House.implementation;

import House.abstracts.Bachloers;

public class Bacholerimpl extends Bachloers{
	@Override
	public void house() {
		System.out.println(" this is the bacholers house");
	}
	public int rent() {
		return 5000;
	}
	public int  advance() {
		return 50000;
		
	}

}
