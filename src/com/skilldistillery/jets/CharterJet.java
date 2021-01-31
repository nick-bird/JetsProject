package com.skilldistillery.jets;

public class CharterJet extends Jet implements Charters {

	private boolean trimIsUpgraded = false;
	private String type = "Charter";

	public CharterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CharterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void upgradeTrim() {
		this.trimIsUpgraded = true;
		System.out.println("Upgrading " + this.getModel() + " to luxury trim...");

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Type: " + this.getType() + ", model: " + this.getModel() + ", speed: " + this.getSpeed() + ", range: "
				+ this.getRange() + ", price: " + this.getPrice();
	}
}
