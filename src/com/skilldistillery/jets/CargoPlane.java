package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	private boolean cargoIsLoaded = false;
	private String type = "Cargo";

	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		this.cargoIsLoaded = true;
		System.out.println("Loading " + this.getModel() + " with cargo...");
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
