package com.skilldistillery.jets;

public class CharterJet extends Jet implements CharterPackage{

	private boolean trimIsUpgraded = false;

	public CharterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CharterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean upgradeTrim() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
